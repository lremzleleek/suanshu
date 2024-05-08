package com.calculator.pojo.question;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"id", "num1","symbol1" ,"num2"})
public class DeciCom extends AllQues{
    private int id;
    private double num1;
    @JsonProperty("result")
    private String symbol1;
    private double num2;

}
