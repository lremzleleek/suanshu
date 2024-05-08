package com.calculator.service.impl;

import com.calculator.mapper.DualMulMapper;
import com.calculator.mapper.RandomMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.DualMul;
import com.calculator.service.util.NumberUtil;
import com.calculator.service.util.TableSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DualMulService {
    @Autowired
    private DualMulMapper dualMulMapper;

    @Autowired
    private RandomMapper randomMapper;


    public List<DualMul> selectDualMul(ExerciseMsg exerciseMsg) {
        String tablename= TableSearch.tableSearch(exerciseMsg.getGradeId(),exerciseMsg.getQuesId());
        List<DualMul>  list=new ArrayList<>();
        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> listInt = NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(listInt);
        for(Integer i: listInt){
            DualMul temp;
            temp=dualMulMapper.selectDualMul(tablename,i);
            temp.setGradeId(exerciseMsg.getGradeId());
            temp.setQuesId(exerciseMsg.getQuesId());
            list.add(temp);
        }

        return list;
    }
    public DualMul findDualMul(int gradeId, int quesId, int titleId) {
        String tablename=TableSearch.tableSearch(gradeId,quesId);
        return dualMulMapper.selectDualMul(tablename,titleId);
    }
}