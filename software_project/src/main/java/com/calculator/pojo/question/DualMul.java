package com.calculator.pojo.question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DualMul {
    private int num1;
    private int num2;
    private String symbol1;
    private int result;
}

//二年级上：2-5乘法、10乘法 2
//二年级下：表内除法 1

//三年级上： 6
// 整十、整百乘法
//末尾有0的三位数乘一位数
//中间有0的三位数乘一位数
//两位数乘一位数（不进位）
//两位数乘一位数（进位）
//多位数乘一位数

//三年级下： 6
// 两位数除以一位数
//末尾有0的三位数除以一位数
//三位数除以一位数
//商中间有0的除法
//商尾数有0的除法
//除数为一位数