package com.calculator.controller;

import com.calculator.pojo.question.FraMix;
import com.calculator.pojo.message.Result;
import com.calculator.service.impl.FraMixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FraMixController {
    @Autowired
    private FraMixService fraMixService;

    @RequestMapping("FraMix")
    public Result selectFraMix() {
    //    List<FraMix> list =fraMixService.selectFraMix(3);
        return Result.success();}
}
