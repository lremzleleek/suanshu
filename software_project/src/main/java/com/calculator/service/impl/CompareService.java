package com.calculator.service.impl;

import com.calculator.mapper.CompareMapper;
import com.calculator.mapper.RandomMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.message.FindMsg;
import com.calculator.pojo.question.Compare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompareService {
    @Autowired
    private CompareMapper compareMapper;
    @Autowired
    private RandomMapper randomMapper;

    private String tablename;
    public List<Compare> selectCom(ExerciseMsg exerciseMsg) {
        switch (exerciseMsg.getGradeId()) {
            case 1: {
                switch (exerciseMsg.getQuesId()) {
                    case 1: tablename="fivecom";break;
                    case 5: tablename="tencom";break;
                    case 12: tablename="twecom";break;
                }
            }
            break;
            case 2: {
                switch (exerciseMsg.getQuesId()) {
                    case 1: tablename="huncom";break;
                }
            }
            break;
            default:return null;
        }

        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> list=NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(list);
        return compareMapper.selectCom(exerciseMsg,tablename,list);
    }
    public List<Compare> selectCom(FindMsg findMsg) {
        switch (findMsg.getGradeId()) {
            case 1: {
                switch (findMsg.getQuesId()) {
                    case 1: tablename="fivecom";break;
                    case 5: tablename="tencom";break;
                    case 12: tablename="twecom";break;
                }
            }
            break;
            case 2: {
                switch (exerciseMsg.getQuesId()) {
                    case 1: tablename="huncom";break;
                }
            }
            break;
            default:return null;
        }

        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> list=NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(list);
        return compareMapper.selectCom(exerciseMsg,tablename,list);
    }

}
