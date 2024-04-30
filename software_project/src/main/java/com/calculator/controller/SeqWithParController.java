package com.calculator.controller;

import com.calculator.pojo.question.SeqWithPar;
import com.calculator.pojo.message.Result;
import com.calculator.service.impl.SeqWithParService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeqWithParController {
    @Autowired
    private SeqWithParService seqWithParService;

    @RequestMapping("SeqWithPar")
    public Result selectSeqWithPar() {
      //  List<SeqWithPar> list = seqWithParService.selectSeqWithPar(3);
        return Result.success();
    }
}
