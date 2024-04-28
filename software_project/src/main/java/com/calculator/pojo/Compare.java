package com.calculator.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compare {
    private short num1;
    private short num2;
    private String symbol1;
}
//一年级上：5比大小、10比大小、20比大小 3
//一年级下：100比大小 1