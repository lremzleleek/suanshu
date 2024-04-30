package com.calculator.controller;

import com.calculator.mapper.DeleteMapper;
import com.calculator.pojo.message.DeleteMsg;
import com.calculator.pojo.message.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DeleteController {
    @Autowired
    private DeleteMapper deleteMapper;

    @RequestMapping("Delete")
        public Result selectCom(@RequestBody DeleteMsg deleteMsg) {
        if(deleteMapper.delete(deleteMsg))
        {return Result.success();}
        else
        {return Result.error("失败");}
    }
}

