package com.calculator.pojo.question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeciCom extends AllQues{
    private int id;
    private double num1;
    private double num2;
    private String symbol1;
}
