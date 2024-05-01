package com.calculator.controller.backup;

import com.calculator.pojo.message.Result;
import com.calculator.service.impl.DeciComService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
