package com.calculator.service.impl;

import com.calculator.mapper.RandomMapper;
import com.calculator.mapper.SeqNoParMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.SeqNoPar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeqNoParService{
    @Autowired
    private SeqNoParMapper seqNoParMapper;
    @Autowired
    private RandomMapper randomMapper;

    private String tablename;
    public List<SeqNoPar> selectSeqNoPar(ExerciseMsg exerciseMsg) {
        switch (exerciseMsg.getGradeId()) {
            case 1: tablename="tenaddsub";
            break;
            case 3: {
                switch (exerciseMsg.getQuesId()) {
                    case 5: tablename="hubaddsub";break;
                    case 8: tablename="mutaddsub";break;   //舍去
                }
            }
            break;
            case 4: {
                switch (exerciseMsg.getQuesId()) {
                    case 2: tablename="hubaddsub";break;
                    case 4: tablename="hunmutandiv";break;
                }
            }
            break;
            default:return null;
        }
        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> list=NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(list);
        return seqNoParMapper.selectSeqNoPar(exerciseMsg,tablename,list);
    }
}
