package com.calculator.mapper;

import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.FraCom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FraComMapper {
    public List<FraCom> selectFraCom(ExerciseMsg exerciseMsg, String tablename, List<Integer> list);
}

