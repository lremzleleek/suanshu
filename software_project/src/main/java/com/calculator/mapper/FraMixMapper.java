package com.calculator.mapper;

import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.FraMix;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FraMixMapper {
    public FraMix selectFraMix(String tablename,Integer id);
}

