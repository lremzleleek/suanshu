package com.calculator.controller;

import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.message.Result;
import com.calculator.pojo.question.*;
import com.calculator.service.impl.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExerciseController {
    @Autowired
    private ExerciseService exerciseService;

    @RequestMapping("/exercise")
    public Result exercise(@RequestBody ExerciseMsg exerciseMsg) {
        List<?> list=null;
        list=exerciseService.exercise(exerciseMsg);
        if(list!=null)
                return Result.success(list);
        else return Result.error("失败");
            }
}