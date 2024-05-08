package com.calculator.service.impl;

import com.calculator.mapper.FraAddMapper;
import com.calculator.mapper.RandomMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.FraAdd;
import com.calculator.service.util.NumberUtil;
import com.calculator.service.util.TableSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FraAddService{
    @Autowired
    private FraAddMapper fraAddMapper;

    @Autowired
    private RandomMapper randomMapper;


    public List<FraAdd> selectFraAdd(ExerciseMsg exerciseMsg) {
        String tablename= TableSearch.tableSearch(exerciseMsg.getGradeId(),exerciseMsg.getQuesId());
        List<FraAdd>  list=new ArrayList<>();
        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> listInt = NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(listInt);
        for(Integer i: listInt){
            FraAdd temp;
            temp=fraAddMapper.selectFraAdd(tablename,i);
            temp.setGradeId(exerciseMsg.getGradeId());
            temp.setQuesId(exerciseMsg.getQuesId());
            list.add(temp);
        }

        return list;
    }
    public FraAdd findFraAdd(int gradeId, int quesId, int titleId) {
        String tablename=TableSearch.tableSearch(gradeId,quesId);
        return fraAddMapper.selectFraAdd(tablename,titleId);
    }
}
