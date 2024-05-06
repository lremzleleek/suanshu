package com.calculator.pojo.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChangeInfo {
    private int userId;   //不能为空
    private List<ChangeMsg> list;
}

//"list":[
//        {
//        "gradeId":1,    //年级id
//        "quesId":1,     //题型id
//        "id":11,        //题目id
//        "type":3        //
//        }
//        {
//        "gradeId":1,
//        "quesId":1,
//        "id":11.
//        "type":3
//        }
//        ]