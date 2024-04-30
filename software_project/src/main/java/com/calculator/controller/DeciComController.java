package com.calculator.controller;

import com.calculator.pojo.question.DeciCom;
import com.calculator.pojo.message.Result;
import com.calculator.service.impl.DeciComService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeciComController {
    @Autowired
    private DeciComService deciComService;

    @RequestMapping("DeciCom")
    public Result selectDeciCom() {
    //    List<DeciCom> list = deciComService.selectDeciCom(3);
        return Result.success();
    }
}
