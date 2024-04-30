package com.calculator.mapper;

import com.calculator.pojo.message.InsertMsg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InsertMapper {
    public int insert(InsertMsg insertMsg);
}
