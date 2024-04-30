package com.calculator.controller;

import com.calculator.pojo.question.SeqNoPar;
import com.calculator.pojo.message.Result;
import com.calculator.service.impl.SeqNoParService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeqNoParController {
    @Autowired
    private SeqNoParService seqNoParService;

    @RequestMapping("SeqNoPar")
    public Result selectSeqNoPar() {
      //  List<SeqNoPar> list = seqNoParService.selectSeqNoPar(3);
        return Result.success();
    }
}
