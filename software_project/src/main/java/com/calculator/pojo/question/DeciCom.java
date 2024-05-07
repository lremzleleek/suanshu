package com.calculator.pojo.question;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeciCom extends AllQues{
    private int id;
    private double num1;
    @JsonProperty("result")
    private String symbol1;
    private double num2;

}
