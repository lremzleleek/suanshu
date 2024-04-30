package com.calculator.mapper;

import com.calculator.pojo.message.DeleteMsg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeleteMapper {
    public boolean delete(DeleteMsg deleteMsg);
}