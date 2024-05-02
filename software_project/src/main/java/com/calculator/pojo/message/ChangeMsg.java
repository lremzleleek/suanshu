package com.calculator.pojo.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChangeMsg {
    private int userId;
    private int gradeId;
    private int quesId;
    private int type;
}
