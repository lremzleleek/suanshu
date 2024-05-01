package com.calculator.pojo.message;

import com.calculator.pojo.question.AllQues;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsertQuesMsg {
    private int userId;
    private int gradeId;   //年级ID
    private int quesId;   //题型ID
    private List<AllQues> list;       //题目LIST表
    private String[] userResult;
    private boolean[] accuracy;
    private int type;
}
