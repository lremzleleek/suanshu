package com.calculator.controller;

import com.calculator.pojo.question.FraCom;
import com.calculator.pojo.message.Result;
import com.calculator.service.impl.FraComService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FraComController {
    @Autowired
    private FraComService fraComService;

    @RequestMapping("FraCom")
    public Result selectFraCom() {
    //    List<FraCom> list = fraComService.selectFraCom(3);
        return Result.success();
    }
}
