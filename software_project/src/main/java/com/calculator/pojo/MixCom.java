package com.calculator.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MixCom {
    private int num1;
    private char symbol1;      //原为symbol
    private int num2;
    private char symbol2;   //比较符号
    private int num3;
    private char symbol3;
    private int num4;
}
//12+3>9-4
//一年级上：20加减法比大小
//一年级下：100以内加减法比大小