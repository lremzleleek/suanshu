package com.calculator.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int UserId;
    private String Name;
    private int totalQues;
    private int falseQues;
}
