package com.calculator.service.impl;

import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExerciseService {
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

    public List<?> exercise(ExerciseMsg exerciseMsg)
    {
        List<?>  list;
        AllQues allQues =TypeSearch.typeSearch(exerciseMsg.getGradeId(),exerciseMsg.getQuesId());
        if (allQues instanceof Compare) {
            list=compareService.selectCom(exerciseMsg);
        } else if (allQues instanceof DualAdd) {
            list= dualAddService.selectDualAdd(exerciseMsg);
        } else if (allQues instanceof MixCom) {
            list=mixComService.selectMixCom(exerciseMsg);
        }else if (allQues instanceof DualMul) {
            list=dualMulService.selectDualMul(exerciseMsg);
        } else if (allQues instanceof FraAdd) {
            list=fraAddService.selectFraAdd(exerciseMsg);
        }else if (allQues instanceof FraCom) {
            list=fraComService.selectFraCom(exerciseMsg);
        } else if (allQues instanceof FraMix) {
            list= fraMixService.selectFraMix(exerciseMsg);
        }else if (allQues instanceof SeqNoPar) {
            list= seqNoParService.selectSeqNoPar(exerciseMsg);
        } else if (allQues instanceof SeqWithPar) {
            list= seqWithParService.selectSeqWithPar(exerciseMsg);
        }else if(allQues instanceof DeciCom){
            list=deciComService.selectDeciCom(exerciseMsg);
        } else if (allQues instanceof Split) {
            list=splitService.selectSplit(exerciseMsg);
        }
        else
            return null;


        return  list;
    }

}
