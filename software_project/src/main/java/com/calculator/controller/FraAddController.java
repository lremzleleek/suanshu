package com.calculator.controller;

import com.calculator.pojo.question.FraAdd;
import com.calculator.pojo.message.Result;
import com.calculator.service.impl.FraAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FraAddController {
    @Autowired
    private FraAddService fraAddService;

    @RequestMapping("FraAdd")
    public Result selectFraAdd() {
     //   List<FraAdd> list = fraAddService.selectFraAdd(3);
        return Result.success();
    }
}
