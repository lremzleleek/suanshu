package com.calculator.controller.backup;

import com.calculator.pojo.message.Result;
import com.calculator.service.impl.MixComService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
