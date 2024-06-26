package com.calculator.pojo.question;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"id", "div1","symbol1" ,"div2"})
public class FraCom extends AllQues{
    private int id;
    private String div1;
    @JsonProperty("result")
    private String symbol1;
    private String div2;

}

// 三（上）分数比大小