package com.calculator.pojo.question;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"id", "div1","symbol1" ,"div2","symbol2","div3","symbol3","div4"})
public class FraMix extends AllQues{
    private int id;
    private String div1;
    private String symbol1;
    private String div2;
    private String symbol2;   //比较符号
    private String div3;
    private String symbol3;
    private String div4;
}

//1/3+1/3>2/9+1/6
//三（上）分数加减法比大小
