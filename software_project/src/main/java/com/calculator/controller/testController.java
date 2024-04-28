package com.calculator.controller;

import com.calculator.pojo.Compare;
import com.calculator.pojo.Result;
import com.calculator.service.impl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testController {
    @Autowired
    private TestService testService;

    @RequestMapping("test")
    public Result selectCom() {
        List<Compare> list = testService.selectCom();
        return Result.success(list);
    }
}
