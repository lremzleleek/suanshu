package com.calculator.service.impl;

import com.calculator.mapper.MixComMapper;
import com.calculator.mapper.RandomMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.MixCom;
import com.calculator.service.util.NumberUtil;
import com.calculator.service.util.TableSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MixComService{
    @Autowired
    private MixComMapper mixComMapper;
    @Autowired
    private RandomMapper randomMapper;


    public List<MixCom> selectMixCom(ExerciseMsg exerciseMsg) {
        String tablename= TableSearch.tableSearch(exerciseMsg.getGradeId(),exerciseMsg.getQuesId());
        List<MixCom>  list=new ArrayList<>();
        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> listInt = NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(listInt);
        for(Integer i: listInt){
            MixCom temp;
            temp=mixComMapper.selectMixCom(tablename,i);
            temp.setGradeId(exerciseMsg.getGradeId());
            temp.setQuesId(exerciseMsg.getQuesId());
            list.add(temp);
        }

        return list;
    }
    public MixCom findMixCom(int gradeId, int quesId, int titleId) {
        String tablename=TableSearch.tableSearch(gradeId,quesId);
        return mixComMapper.selectMixCom(tablename,titleId);
    }
}
