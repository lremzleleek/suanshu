package com.calculator.mapper;

import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.DeciCom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeciComMapper {
    public List<DeciCom> selectDeciCom(ExerciseMsg exerciseMsg, String tablename, List<Integer> list);
}
