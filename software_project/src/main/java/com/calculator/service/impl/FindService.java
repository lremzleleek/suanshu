package com.calculator.service.impl;

import com.calculator.mapper.FindAllMapper;
import com.calculator.mapper.TableSearchMapper;
import com.calculator.pojo.entity.UserQues;
import com.calculator.pojo.message.FindMsg;
import com.calculator.pojo.question.*;
import com.calculator.service.util.TableSearch;
import com.calculator.service.util.TypeSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FindService {
    @Autowired
    private FindAllMapper findAllMapper;
    @Autowired
    private TableSearch tableSearch;
    @Autowired
    private TableSearchMapper tableSearchMapper;
    @Autowired
    private TypeSearch typeSearch;
    @Autowired
    private CompareService compareService;
    @Autowired
    private DualAddService dualAddService;
    @Autowired
    private MixComService mixComService;
    @Autowired
    private DualMulService dualMulService;
    @Autowired
    private FraAddService fraAddService;
    @Autowired
    private FraComService fraComService;
    @Autowired
    private  FraMixService fraMixService;
    @Autowired
    private SeqNoParService seqNoParService;
    @Autowired
    private SeqWithParService seqWithParService;
    @Autowired
    private  DeciComService deciComService;
    @Autowired
    private SplitService splitService;

    public List<Object> find(FindMsg findMsg) {
        List<Object> quesList = new ArrayList<>();
        List<UserQues> listAll = findAllMapper.findAllByUserId(findMsg);
        System.out.println(listAll);
        for (UserQues userQues : listAll) {
            AllQues temp;
            AllQues allQues = typeSearch.typeSearch(userQues.getGradeId(), userQues.getQuesId());
            if (allQues instanceof Compare) {
                temp=compareService.findCom(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId());
                temp.setUserResult(userQues.getUserResult());
                quesList.add(temp);
            } else if (allQues instanceof DualAdd) {
                temp=dualAddService.findDualAdd(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId());
                temp.setUserResult(userQues.getUserResult());
                quesList.add(temp);
            } else if (allQues instanceof MixCom) {
                temp=mixComService.findMixCom(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId());
                temp.setUserResult(userQues.getUserResult());
                quesList.add(temp);
            }else if (allQues instanceof DualMul) {
                temp=dualMulService.findDualMul(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId());
                temp.setUserResult(userQues.getUserResult());
                quesList.add(temp);
            } else if (allQues instanceof FraAdd) {
                temp=fraAddService.findFraAdd(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId());
                temp.setUserResult(userQues.getUserResult());
                quesList.add(temp);
            }else if (allQues instanceof FraCom) {
                temp=fraComService.findFraCom(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId());
                temp.setUserResult(userQues.getUserResult());
                quesList.add(temp);
            } else if (allQues instanceof FraMix) {
                temp=fraMixService.findFraMix(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId());
                temp.setUserResult(userQues.getUserResult());
                quesList.add(temp);
            }else if (allQues instanceof SeqNoPar) {
                temp=seqNoParService.findSeqNoPar(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId());
                temp.setUserResult(userQues.getUserResult());
                quesList.add(temp);
            } else if (allQues instanceof SeqWithPar) {
                temp=seqWithParService.findSeqWithPar(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId());
                temp.setUserResult(userQues.getUserResult());
                quesList.add(temp);
            }else if(allQues instanceof DeciCom){
                temp=deciComService.findDeciCom(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId());
                temp.setUserResult(userQues.getUserResult());
                quesList.add(temp);
            }
            else
                return null;
        }

        return quesList;
    }}
