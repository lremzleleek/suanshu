package com.calculator.service.impl;

import com.calculator.mapper.RandomMapper;
import com.calculator.mapper.SeqWithParMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.SeqWithPar;
import com.calculator.service.util.NumberUtil;
import com.calculator.service.util.TableSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeqWithParService {
    @Autowired
    private SeqWithParMapper seqWithParMapper;
    @Autowired
    private RandomMapper randomMapper;



    public List<SeqWithPar> selectSeqWithPar(ExerciseMsg exerciseMsg) {
        String tablename = TableSearch.tableSearch(exerciseMsg.getGradeId(), exerciseMsg.getQuesId());
        List<SeqWithPar> list = new ArrayList<>();
        Integer minNum = randomMapper.getMinNum(tablename);
        Integer maxNum = randomMapper.getMaxNum(tablename);
        List<Integer> listInt = NumberUtil.randomCommon(minNum, maxNum, exerciseMsg.getQuesNum());
        System.out.println(listInt);
        for (Integer i : listInt) {
            SeqWithPar temp;
            temp=seqWithParMapper.selectSeqWithPar(tablename, i);
            temp.setGradeId(exerciseMsg.getGradeId());
            temp.setQuesId(exerciseMsg.getQuesId());
            list.add(temp);
        }

        return list;
    }
    public SeqWithPar findSeqWithPar(int gradeId, int quesId, int titleId) {
        String tablename=TableSearch.tableSearch(gradeId,quesId);
        return seqWithParMapper.selectSeqWithPar(tablename,titleId);
    }
}