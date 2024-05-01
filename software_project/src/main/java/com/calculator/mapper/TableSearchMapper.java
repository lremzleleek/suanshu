package com.calculator.mapper;

import com.calculator.pojo.message.FindMsg;
import com.calculator.pojo.question.AllQues;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TableSearchMapper {
    @Select("select * from ${tablename} where id=#{id}")
    public AllQues search(String tablename, int id);
}
