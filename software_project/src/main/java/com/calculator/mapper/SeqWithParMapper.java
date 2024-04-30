package com.calculator.mapper;

import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.SeqWithPar;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SeqWithParMapper {
    public List<SeqWithPar> selectSeqWithPar(ExerciseMsg exerciseMsg, String tablename, List<Integer> list);
}

