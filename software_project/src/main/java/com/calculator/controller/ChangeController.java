package com.calculator.controller;

import com.calculator.mapper.ChangeMapper;
import com.calculator.pojo.message.ChangeInfo;
import com.calculator.pojo.message.ChangeMsg;
import com.calculator.pojo.message.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class ChangeController {
    @Autowired
    private ChangeMapper changeMapper;

    @RequestMapping("/change")
        public Result change(@RequestBody ChangeInfo changeInfo) {
        boolean flag=true;
        List<ChangeMsg> list=changeInfo.getList();
        for(ChangeMsg change:list){
            change.setUserId(changeInfo.getUserId());
            if(!changeMapper.change(change))
            {
                flag=false;
            }
        }
        if (flag==true)
            return Result.success();
        else
            return Result.error("失败了");
    }
}

