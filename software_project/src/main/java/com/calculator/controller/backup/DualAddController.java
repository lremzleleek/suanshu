package com.calculator.controller.backup;

import com.calculator.pojo.message.Result;
import com.calculator.service.impl.DualAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DualAddController {
    @Autowired
    private DualAddService dualAddService;

    @RequestMapping("DualAdd")
    public Result selectDualAdd() {
       // List<DualAdd> list = dualAddService.selectDualAdd(3);
        return Result.success();
    }
}

