package com.calculator.controller;

import com.alibaba.fastjson.JSONObject;
import com.calculator.pojo.question.Compare;
import com.calculator.pojo.message.Result;
import com.calculator.service.impl.CompareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompareController {
    @Autowired
    private CompareService compareService;

    @RequestMapping("Compare")
    public Result selectCom(@RequestBody JSONObject js) {
 //       List<Compare> list = compareService.selectCom(js.getInteger("count"));
        return Result.success();
    }


}
