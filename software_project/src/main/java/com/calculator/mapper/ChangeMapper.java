package com.calculator.mapper;

import com.calculator.pojo.message.ChangeMsg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChangeMapper {
    public boolean change(ChangeMsg changeMsg);
}