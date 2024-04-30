package com.calculator.service.impl;

import com.calculator.mapper.RandomMapper;
import com.calculator.mapper.SeqWithParMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.SeqWithPar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeqWithParService{
    @Autowired
    private SeqWithParMapper seqWithParMapper;
    @Autowired
    private RandomMapper randomMapper;

    private String tablename;
    public List<SeqWithPar> selectSeqWithPar(ExerciseMsg exerciseMsg) {
        switch (exerciseMsg.getQuesId()) {
            case 3: tablename="hunaskuohao";
            break;
            case 5: tablename="hunmutandivkuohao";
            break;
            default:return null;
        }
        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> list=NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(list);
        return seqWithParMapper.selectSeqWithPar(exerciseMsg,tablename,list);
    }
    //二年级下：100加减混合运算（有括号）、100乘除混合运算（有括号）
}
