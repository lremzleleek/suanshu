package com.calculator.mapper;

import com.calculator.pojo.message.InsertQuesMsg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InsertQuesMapper {
    public boolean insertQues(InsertQuesMsg insertQuesMsg,Integer titleId,String str,Boolean bool);
}
