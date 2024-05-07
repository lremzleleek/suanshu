package com.calculator.pojo.question;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compare extends AllQues{
    private int id;
    private int num1;
    @JsonProperty("result")
    private String symbol1;
    private int num2;
}
//一年级上：5比大小、10比大小、20比大小 3
//一年级下：100比大小 1