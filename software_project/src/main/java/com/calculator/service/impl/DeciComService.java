package com.calculator.service.impl;

import com.calculator.mapper.DeciComMapper;
import com.calculator.mapper.RandomMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.DeciCom;
import com.calculator.service.util.NumberUtil;
import com.calculator.service.util.TableSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeciComService{
    @Autowired
    private DeciComMapper deciComMapper;

    @Autowired
    private RandomMapper randomMapper;


    public List<DeciCom> selectDeciCom(ExerciseMsg exerciseMsg) {
        String tablename= TableSearch.tableSearch(exerciseMsg.getGradeId(),exerciseMsg.getQuesId());
        List<DeciCom>  list=new ArrayList<>();
        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> listInt = NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(listInt);
        for(Integer i: listInt){
            list.add(deciComMapper.selectDeciCom(tablename,i));
        }

        return list;
    }
    public DeciCom findDeciCom(int gradeId,int quesId,int titleId) {
        String tablename=TableSearch.tableSearch(gradeId,quesId);
        return deciComMapper.selectDeciCom(tablename,titleId);
    }
}