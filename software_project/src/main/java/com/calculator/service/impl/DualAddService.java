package com.calculator.service.impl;

import com.calculator.mapper.CompareMapper;
import com.calculator.mapper.DualAddMapper;
import com.calculator.mapper.RandomMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.Compare;
import com.calculator.pojo.question.DualAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DualAddService{
    @Autowired
    private DualAddMapper dualAddMapper;

    @Autowired
    private RandomMapper randomMapper;

    public List<DualAdd> selectDualAdd(ExerciseMsg exerciseMsg) {
        String tablename=TableSearch.tableSearch(exerciseMsg.getGradeId(),exerciseMsg.getQuesId());
        List<DualAdd>  list=new ArrayList<>();
        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> listInt =NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());

        for(Integer i: listInt){
            list.add(dualAddMapper.selectDualAdd(tablename,i));
        }

        return list;

    }
    public DualAdd findDualAdd(int gradeId,int quesId,int titleId) {
        String tablename=TableSearch.tableSearch(gradeId,quesId);
        return dualAddMapper.selectDualAdd(tablename,titleId);
    }
}

//5加法		int num1	char symbol1	int num2
//5减法		int num1	char symbol1	int num2
//0加减		int num1	char symbol1	int num2
//10加法		int num1	char symbol1	int num2
//10减法		int num1	char symbol1	int num2
//10加减		int num1	char symbol1	int num2
//10进位加法		int num1	char symbol1	int num2
//20加减		int num1	char symbol1	int num2