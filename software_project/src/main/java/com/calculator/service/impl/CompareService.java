package com.calculator.service.impl;

import com.calculator.mapper.CompareMapper;
import com.calculator.mapper.RandomMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.Compare;
import com.calculator.service.util.NumberUtil;
import com.calculator.service.util.TableSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompareService {
    @Autowired
    private CompareMapper compareMapper;
    @Autowired
    private RandomMapper randomMapper;


    public List<Compare> selectCom(ExerciseMsg exerciseMsg) {
        String tablename= TableSearch.tableSearch(exerciseMsg.getGradeId(),exerciseMsg.getQuesId());
        List<Compare>  list=new ArrayList<>();
        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> listInt = NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(listInt);
        for(Integer i: listInt){
            list.add(compareMapper.selectCom(tablename,i));
        }

        return list;
    }

    public Compare findCom(int gradeId,int quesId,int titleId) {
        String tablename=TableSearch.tableSearch(gradeId,quesId);
            return compareMapper.selectCom(tablename,titleId);
    }
}
