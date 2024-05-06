package com.calculator.pojo.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChangeMsg {
    private int userId;   //可以为空
    private int gradeId;
    private int quesId;
    private int id;
    private int type;
}
