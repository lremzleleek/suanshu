package com.calculator.pojo.question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FraAdd extends AllQues{
    private int id;
    private String div1;
    private String div2;
    private String result;
    private String symbol1;
}

//三（上）分数加减
