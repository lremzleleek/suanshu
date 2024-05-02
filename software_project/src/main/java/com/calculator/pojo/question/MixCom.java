package com.calculator.pojo.question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MixCom extends AllQues{
    private int id;
    private int num1;
    private String symbol1;      //原为symbol
    private int num2;
    private String symbol2;   //比较符号
    private int num3;
    private String symbol3;
    private int num4;
}
//12+3>9-4
//一年级上：20加减法比大小
//一年级下：100以内加减法比大小