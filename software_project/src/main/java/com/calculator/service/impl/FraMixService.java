package com.calculator.service.impl;

import com.calculator.mapper.FraMixMapper;
import com.calculator.mapper.RandomMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.FraMix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FraMixService{
    @Autowired
    private FraMixMapper fraMixMapper;
    @Autowired
    private RandomMapper randomMapper;

    private String tablename;
    public List<FraMix> selectFraMix(ExerciseMsg exerciseMsg) {
        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> list=NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(list);
        return fraMixMapper.selectFraMix(exerciseMsg,tablename,list);
    }
}
