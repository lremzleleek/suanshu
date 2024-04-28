package com.calculator.service.impl;

import com.calculator.mapper.TestMapper;
import com.calculator.pojo.Compare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService implements com.calculator.service.TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public List<Compare> selectCom() {
        List<Compare> list = testMapper.selectCom();
        list.stream().forEach(each->{
            System.out.println(each);
                }

        );
        return list;
    }
}
