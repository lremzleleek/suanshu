package com.calculator.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DualAdd {
    private int num1;
    private int num2;
    private char symbol1;
    private int result;

}
//一年级上 8
//5加法		int num1	char symbol1	int num2
//5减法		int num1	char symbol1	int num2
//0加减		int num1	char symbol1	int num2
//10加法		int num1	char symbol1	int num2
//10减法		int num1	char symbol1	int num2
//10加减		int num1	char symbol1	int num2
//10进位加法		int num1	char symbol1	int num2
//20加减		int num1	char symbol1	int num2

//一年级下 7
//整十数加减		int num1	char symbol1	int num2
//两位数加整十数		int num1	char symbol1	int num2
//两位数加一位数		int num1	char symbol1	int num2
//两位数加一位数（进位）		int num1	char symbol1	int num2
//两位数减一位数		int num1	char symbol1	int num2
//两位数减一位数（退位）		int num1	char symbol1	int num2
//两位数加减一位数混合		int num1	char symbol1	int num2

//二年级上 二年级下无题型 4
//100不进位加法		int num1	char symbol1	int num2
//100不退位减法		int num1	char symbol1	int num2
//100进位加法		int num1	char symbol1	int num2
//100退位减法		int num1	char symbol1	int num2

//三年级上
//两位数加两位数		int num1	char symbol1	int num2
//两位数减两位数		int num1	char symbol1	int num2
//末尾有0的三位数加法		int num1	char symbol1	int num2
//末尾有0的三位数减法		int num1	char symbol1	int num2
//三位数不进位加法		int num1	char symbol1	int num2
//三位数进位加法		int num1	char symbol1	int num2
//三位数不退位减法		int num1	char symbol1	int num2
//三位数退位减法		int num1	char symbol1	int num2
