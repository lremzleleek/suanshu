package com.calculator.service.impl;

import com.calculator.mapper.FraAddMapper;
import com.calculator.mapper.RandomMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.FraAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FraAddService{
    @Autowired
    private FraAddMapper fraAddMapper;

    @Autowired
    private RandomMapper randomMapper;

    private String tablename;
    public List<FraAdd> selectFraAdd(ExerciseMsg exerciseMsg) {
        switch (exerciseMsg.getQuesId())
        {
            case 16:tablename="fenshuadd";break;
            case 17:tablename="fenshusub";break;
            default:return null;
        }

        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> list=NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(list);
        return fraAddMapper.selectFraAdd(exerciseMsg,tablename,list);
    }
}
