package com.calculator.mapper;

import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.SeqNoPar;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SeqNoParMapper {
    public List<SeqNoPar> selectSeqNoPar(ExerciseMsg exerciseMsg, String tablename, List<Integer> list);
}

