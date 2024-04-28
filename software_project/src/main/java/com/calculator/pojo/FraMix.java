package com.calculator.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FraMix {
    private Fraction div1;
    private Fraction div2;
    private Fraction div3;
    private Fraction div4;
    private char symbol1;
    private char symbol2;   //比较符号
    private char symbol3;
}

//1/3+1/3>2/9+1/6
//三（上）分数加减法比大小
