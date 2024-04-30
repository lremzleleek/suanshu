package com.calculator.service.impl;

import com.calculator.mapper.MixComMapper;
import com.calculator.mapper.RandomMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.MixCom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MixComService{
    @Autowired
    private MixComMapper mixComMapper;
    @Autowired
    private RandomMapper randomMapper;

    private String tablename;
    public List<MixCom> selectMixCom(ExerciseMsg exerciseMsg) {
        switch (exerciseMsg.getGradeId()) {
            case 1: tablename="tweaaorss";
            break;
            case 2:tablename="hunaaorss";
            break;
            default:return null;
        }

        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> list=NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(list);
        return mixComMapper.selectMixCom(exerciseMsg,tablename,list);
    }
}
