package com.calculator.service.impl;

import com.calculator.mapper.DeciComMapper;
import com.calculator.mapper.RandomMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.DeciCom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeciComService{
    @Autowired
    private DeciComMapper deciComMapper;

    @Autowired
    private RandomMapper randomMapper;

    private String tablename;
    public List<DeciCom> selectDeciCom(ExerciseMsg exerciseMsg) {
        tablename="xiaoshu";
        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> list=NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(list);
        return deciComMapper.selectDeciCom(exerciseMsg,tablename,list);
    }
}