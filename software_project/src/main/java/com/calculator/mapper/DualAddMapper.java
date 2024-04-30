package com.calculator.mapper;

import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.DualAdd;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface DualAddMapper {
        public List<DualAdd> selectDualAdd(ExerciseMsg exerciseMsg,String tablename,List<Integer> list);
}


