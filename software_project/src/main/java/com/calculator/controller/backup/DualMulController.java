package com.calculator.controller.backup;

import com.calculator.pojo.message.Result;
import com.calculator.service.impl.DualMulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DualMulController {
    @Autowired
    private DualMulService dualMulService;

    @RequestMapping("DualMul")
    public Result selectDualMul() {
    //    List<DualMul> list = dualMulService.selectDualMul(3);
        return Result.success();
    }
}