package com.calculator.mapper;

import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.Compare;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CompareMapper {
    public List<Compare> selectCom(ExerciseMsg exerciseMsg,String tablename,List<Integer> list);
}
