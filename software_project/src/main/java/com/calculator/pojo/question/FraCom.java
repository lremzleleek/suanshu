package com.calculator.pojo.question;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FraCom extends AllQues{
    private int id;
    private String div1;
    private String div2;
    @JsonProperty("result")
    private String symbol1;
}

// 三（上）分数比大小