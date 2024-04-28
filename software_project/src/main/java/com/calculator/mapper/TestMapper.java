package com.calculator.mapper;

import com.calculator.pojo.Compare;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {
    @Select("select * from fivecom")
    public List<Compare> selectCom();
}
