package com.calculator.controller;

import com.calculator.mapper.InsertMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsertController {
    @Autowired
    private InsertMapper insertMapper;
    @RequestMapping("Insert")
    public String insert() {
    return null;
    }
}
