package com.calculator.pojo.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseMsg {
    private int userId;
    private int gradeId;
    private int quesId;
    private int quesNum;
}
