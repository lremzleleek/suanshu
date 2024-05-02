package com.calculator.controller;

import com.calculator.mapper.InsertQuesMapper;
import com.calculator.pojo.message.InsertQuesMsg;
import com.calculator.pojo.message.Result;
import com.calculator.service.impl.InsertQuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class InsertQuesController {
    @Autowired
    private InsertQuesService insertQuesService;
    @RequestMapping("insert")
    public Result insertQues(@RequestBody InsertQuesMsg insertQuesMsg) {
        if(insertQuesService.InsertQues(insertQuesMsg))
            return Result.success(insertQuesMsg);
        else return Result.error("插入失败");
    }
}
