package com.calculator.controller;

import com.calculator.pojo.message.FindMsg;
import com.calculator.pojo.message.Result;
import com.calculator.service.impl.FindJudgeService;
import com.calculator.service.impl.FindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindController {
@Autowired
    private FindJudgeService findJudgeService;

    @RequestMapping("/find")
    public Result find(@RequestBody FindMsg findMsg) {
        List<Object> list=findJudgeService.find(findMsg);
        return Result.success(list);
    }

}
