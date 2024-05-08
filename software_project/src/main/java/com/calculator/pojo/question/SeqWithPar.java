package com.calculator.pojo.question;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"id", "symbol1","num1","symbol2" ,"symbol3" ,"num2","symbol4" ,"symbol5" ,"num3" ,"symbol6" ,"result"})
public class SeqWithPar extends AllQues{
    private int id;
    private String symbol1;  //(   null
    private int num1; //10  40
    private String symbol2;  //*   -
    private String symbol3;  //null  (
    private int num2; //2   5
    private String symbol4;  //)  null
    private String symbol5;  //+   *
    private int num3; //1   1
    private String symbol6;  //null   )
    private int result; //21   45




}
//char symbol1	int num1	char symbol2  int num2
//char symbol2	char symbol3		int num3	char symbol5
//示例：（10*2）+1=21   40-(5*1)=35
//二年级下：100加减混合运算（有括号）、100乘除混合运算（有括号）