package com.calculator.service.impl;

import com.calculator.mapper.FraComMapper;
import com.calculator.mapper.RandomMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.FraCom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FraComService{
    @Autowired
    private FraComMapper fraComMapper;
    @Autowired
    private RandomMapper randomMapper;

    private String tablename;
    public List<FraCom> selectFraCom(ExerciseMsg exerciseMsg) {
        tablename="fenshucom";
        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> list=NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(list);
        return fraComMapper.selectFraCom(exerciseMsg,tablename,list);
    }
}
