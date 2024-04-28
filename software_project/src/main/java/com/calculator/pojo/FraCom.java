package com.calculator.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FraCom {
    private Fraction div1;
    private Fraction div2;
    private char symbol1;
}

// 三（上）分数比大小