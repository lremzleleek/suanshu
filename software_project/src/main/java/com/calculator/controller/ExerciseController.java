package com.calculator.controller;

import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.message.Result;
import com.calculator.pojo.question.*;
import com.calculator.service.impl.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExerciseController {
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

    @RequestMapping("/exercise")
    public Result exercise(@RequestBody ExerciseMsg exerciseMsg) {
        List<?> list=null;
        switch (exerciseMsg.getGradeId()) {
            case 1: {
                switch (exerciseMsg.getQuesId()) {
                    case 1, 5, 12:
                        list= compareService.selectCom(exerciseMsg);break;
                    case 2, 3, 4, 6, 7, 10, 11:
                        list=dualAddService.selectDualAdd(exerciseMsg);break;
                    case 9:list= seqNoParService.selectSeqNoPar(exerciseMsg);break;
                    case 13:list= mixComService.selectMixCom(exerciseMsg);break;
                    case 8:list= splitService.selectSplit(exerciseMsg);break;
                }
            }break;
            case 2: {
                switch (exerciseMsg.getQuesId()) {
                    case 1:
                        list= compareService.selectCom(exerciseMsg);break;
                    case 2,3,4,5,6,7:
                        list=dualAddService.selectDualAdd(exerciseMsg);break;
                    case 8:list= splitService.selectSplit(exerciseMsg);break;
                    case 9:list= mixComService.selectMixCom(exerciseMsg);break;
                }
            }break;
            case 3: {
                switch (exerciseMsg.getQuesId()) {
                    case 1,2,3,4:
                        list=dualAddService.selectDualAdd(exerciseMsg);break;
                    case 5,8:list= seqNoParService.selectSeqNoPar(exerciseMsg);break;
                    case 6,7:list=dualMulService.selectDualMul(exerciseMsg);break;
                }
            }break;
            case 4: {
                switch (exerciseMsg.getQuesId()) {
                    case 3,5:
                        list=seqWithParService.selectSeqWithPar(exerciseMsg);break;
                    case 2,4:list= seqNoParService.selectSeqNoPar(exerciseMsg);break;
                    case 1:list=dualMulService.selectDualMul(exerciseMsg);break;
                    case 6:list=splitService.selectSplit(exerciseMsg);break;
                }
            }break;
            case 5: {
                switch (exerciseMsg.getQuesId()) {
                    case 1,2,3,4,5,6,7,8:
                        list=dualAddService.selectDualAdd(exerciseMsg);break;
                    case 9,10,11,12,13:list=dualMulService.selectDualMul(exerciseMsg);break;
                    case 14:list=splitService.selectSplit(exerciseMsg);break;
                    case 16,17:list= fraAddService.selectFraAdd(exerciseMsg);break;
                    case 15:list= fraComService.selectFraCom(exerciseMsg);break;
                }
            }break;
            case 6: {
                switch (exerciseMsg.getQuesId()) {
                    case 1,2,3,4,5:list=dualMulService.selectDualMul(exerciseMsg);break;
                    case 7:list= deciComService.selectDeciCom(exerciseMsg);break;
                    case 6:list=splitService.selectSplit(exerciseMsg);break;
                }
            }break;
            default:list=null;
        }

if(list!=null)
        return Result.success(list);
else return Result.error("失败");
    }
}