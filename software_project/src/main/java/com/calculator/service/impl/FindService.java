package com.calculator.service.impl;

import com.calculator.mapper.FindAllMapper;
import com.calculator.mapper.TableSearchMapper;
import com.calculator.pojo.entity.UserQues;
import com.calculator.pojo.message.FindMsg;
import com.calculator.pojo.question.*;
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
            AllQues allQues = typeSearch.typeSearch(userQues.getGradeId(), userQues.getQuesId());
            if (allQues instanceof Compare) {
                quesList.add(compareService.findCom(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId()));
            } else if (allQues instanceof DualAdd) {
                quesList.add(dualAddService.findDualAdd(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId()));
            } else if (allQues instanceof MixCom) {
                quesList.add(mixComService.findMixCom(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId()));
            }else if (allQues instanceof DualMul) {
                quesList.add(dualMulService.findDualMul(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId()));
            } else if (allQues instanceof FraAdd) {
                quesList.add(fraAddService.findFraAdd(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId()));
            }else if (allQues instanceof FraCom) {
                quesList.add(fraComService.findFraCom(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId()));
            } else if (allQues instanceof FraMix) {
                quesList.add( fraMixService.findFraMix(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId()));
            }else if (allQues instanceof SeqNoPar) {
                quesList.add( seqNoParService.findSeqNoPar(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId()));
            } else if (allQues instanceof SeqWithPar) {
                quesList.add( seqWithParService.findSeqWithPar(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId()));
            }else if(allQues instanceof DeciCom){
                quesList.add(deciComService.findDeciCom(userQues.getGradeId(),userQues.getQuesId(),userQues.getTitleId()));
            }
            else
                return null;
        }

        return quesList;
    }}
