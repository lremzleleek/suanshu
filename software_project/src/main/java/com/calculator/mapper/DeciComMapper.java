package com.calculator.mapper;

import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.DeciCom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeciComMapper {
    public DeciCom selectDeciCom(String tablename,Integer id);
}
