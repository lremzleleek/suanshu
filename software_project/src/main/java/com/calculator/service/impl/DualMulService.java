package com.calculator.service.impl;

import com.calculator.mapper.DualMulMapper;
import com.calculator.mapper.RandomMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.DualMul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DualMulService {
    @Autowired
    private DualMulMapper dualMulMapper;

    @Autowired
    private RandomMapper randomMapper;

    private String tablename;
    public List<DualMul> selectDualMul(ExerciseMsg exerciseMsg) {
        switch (exerciseMsg.getGradeId()) {
            case 3: {
                switch (exerciseMsg.getQuesId()) {
                    case 6:
                        tablename = "fivemut";
                        break;
                    case 7:
                        tablename = "tenmut";
                        break;
                }
            }
            break;
            case 4: {
                switch (exerciseMsg.getQuesId()) {
                    case 1:
                        tablename = "nndiv";
                        break;
                }
            }
            break;
            case 5: {
                switch (exerciseMsg.getQuesId()) {
                    case 9:
                        tablename = "zeromut";
                        break;
                    case 10:
                        tablename = "hunzerotwo";
                        break;
                    case 11:
                        tablename = "hunzeroone";
                        break;
                    case 12:
                        tablename = "tenmutone";
                        break;
                    case 13:
                        tablename = "tenmuttwo";
                        break;
                    case 14:
                        tablename = "fenshucom";
                        break;
                }
            }
            break;
            case 6: {
                switch (exerciseMsg.getQuesId()) {
                    case 1:
                        tablename = "tendivone";
                        break;
                    case 2:
                        tablename = "hunzdiveone";
                        break;
                    case 3:
                        tablename = "hundiveone";
                        break;
                    case 4:
                        tablename = "hundiveonez";
                        break;
                    case 5:
                        tablename = "hundiveonezz";
                        break;
                }
            }
            break;
            default:
                return null;
        };

        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> list=NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(list);
        return dualMulMapper.selectDualMul(exerciseMsg,tablename,list);
    }
}