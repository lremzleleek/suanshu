package com.calculator.mapper;

import com.calculator.pojo.entity.UserQues;
import com.calculator.pojo.message.FindMsg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FindAllMapper {
    @Select("select * from userques where userId=#{userId} and type=#{type} and gradeId=#{gradeId} and accuracy=0")
    public List<UserQues> findAllByUserId(FindMsg findMsg);
}
