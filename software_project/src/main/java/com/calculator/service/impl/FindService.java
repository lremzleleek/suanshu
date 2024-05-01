package com.calculator.service.impl;

import com.calculator.mapper.FindAllMapper;
import com.calculator.pojo.entity.UserQues;
import com.calculator.pojo.message.FindMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindService {
    @Autowired
    private FindAllMapper findAllMapper;

    public List<Object> findService(FindMsg findMsg) {
        List<UserQues> listAll=findAllMapper.findAllByUserId(findMsg);
        for(UserQues userQues:listAll){

        }
    }
}
