package com.calculator.controller;

import com.calculator.pojo.message.FindMsg;
import com.calculator.pojo.message.Result;
import com.calculator.service.impl.FindJudgeService;
import com.calculator.service.impl.FindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class FindController {
@Autowired
    private FindJudgeService findJudgeService;

    @RequestMapping("/find")
    public Result find(@RequestBody FindMsg findMsg) {
        List<Object> list=findJudgeService.find(findMsg);
        return Result.success(list);
    }
}

//{
//        "userId": 1234,
//        "list":[
//        {
//        "gradeId":1,    //年级id
//        "quesId":1,     //题型id
//        "id":13,        //题目id
//        "type":1        //
//        },
//        {
//        "gradeId":1,
//        "quesId":1,
//        "id":22,
//        "type":1
//        }
//        ]
//        }