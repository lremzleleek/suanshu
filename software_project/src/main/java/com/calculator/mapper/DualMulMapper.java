package com.calculator.mapper;

import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.DualMul;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DualMulMapper {
    public DualMul selectDualMul(String tablename,Integer id);
}