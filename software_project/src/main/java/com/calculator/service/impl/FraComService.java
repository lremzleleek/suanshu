package com.calculator.service.impl;

import com.calculator.mapper.FraComMapper;
import com.calculator.mapper.RandomMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.Compare;
import com.calculator.pojo.question.FraAdd;
import com.calculator.pojo.question.FraCom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FraComService{
    @Autowired
    private FraComMapper fraComMapper;
    @Autowired
    private RandomMapper randomMapper;


    public List<FraCom> selectFraCom(ExerciseMsg exerciseMsg) {
        String tablename=TableSearch.tableSearch(exerciseMsg.getGradeId(),exerciseMsg.getQuesId());
        List<FraCom>  list=new ArrayList<>();
        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> listInt =NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(listInt);
        for(Integer i: listInt){
            list.add(fraComMapper.selectFraCom(tablename,i));
        }

        return list;
    }
    public FraCom findFraCom(int gradeId, int quesId, int titleId) {
        String tablename=TableSearch.tableSearch(gradeId,quesId);
        return fraComMapper.selectFraCom(tablename,titleId);
    }
}
