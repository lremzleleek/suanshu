package com.calculator.mapper;

import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.FraAdd;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FraAddMapper {
    public List<FraAdd> selectFraAdd(ExerciseMsg exerciseMsg, String tablename, List<Integer> list);
}

