package com.calculator.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeqNoPar {

    private int num1;
    private int num2;
    private int num3;
    private int result;
    private char symbol1;
    private char symbol2;
}

//示例：33+2-1=34  10*3-1=29   21÷3*2=14
//一年级上：10连加减  1
//二年级上：100连加减、乘法加减法混合 2
//二年级下：100加减混合运算（无括号）、100乘除混合运算（无括号）  2