package com.calculator.pojo.question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FraMix {
    private String div1;
    private String div2;
    private String div3;
    private String div4;
    private String symbol1;
    private String symbol2;   //比较符号
    private String symbol3;
}

//1/3+1/3>2/9+1/6
//三（上）分数加减法比大小
