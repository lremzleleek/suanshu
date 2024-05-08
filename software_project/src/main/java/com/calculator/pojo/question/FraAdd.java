package com.calculator.pojo.question;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"id", "div1","symbol1" ,"div2","result"})
public class FraAdd extends AllQues{
    private int id;
    private String div1;
    private String symbol1;
    private String div2;
    private String result;

}

//三（上）分数加减
