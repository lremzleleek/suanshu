package com.calculator.pojo.message;

import com.calculator.pojo.question.AllQues;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindMsg {
    private int userId;
    private int gradeId;
    private int type;   //1、横式计算；2、竖式计算；3、比大小
}
