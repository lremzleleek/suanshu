package com.calculator.mapper;

import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.MixCom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MixComMapper {
    public List<MixCom> selectMixCom(ExerciseMsg exerciseMsg, String tablename, List<Integer> list);
}

