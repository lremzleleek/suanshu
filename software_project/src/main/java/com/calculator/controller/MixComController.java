package com.calculator.controller;

import com.calculator.pojo.question.MixCom;
import com.calculator.pojo.message.Result;
import com.calculator.service.impl.MixComService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MixComController {
    @Autowired
    private MixComService mixComService;

    @RequestMapping("MixCom")
    public Result selectMixCom() {
    //    List<MixCom> list =mixComService.selectMixCom(3);
        return Result.success();
    }
}
