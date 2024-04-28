package com.calculator.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FraAdd {
    private Fraction div1;
    private Fraction div2;
    private Fraction result;
    private char symbol1;
}

//三（上）分数加减
