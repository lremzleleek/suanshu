package com.calculator.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserQues {
    private int userId;
    private int gradeId;   //年级ID
    private int quesId;   //题型ID
    private int titleId;       //题目ID
    private String userResult;
    private boolean accuracy;
    private int type;
}
