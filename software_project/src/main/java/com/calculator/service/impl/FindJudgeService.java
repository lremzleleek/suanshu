package com.calculator.service.impl;

import com.calculator.pojo.message.FindMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FindJudgeService {
    @Autowired
    private FindService findService;

    public List<Object> find(FindMsg findMsg) {
        int gradeId=findMsg.getGradeId();
        int type=findMsg.getType();
        List<Object> allList=new ArrayList<Object>();
        FindMsg findMsg1=findMsg;
        if(gradeId==0&&type==0){
            for(int i=1;i<=6;i++){
                for(int j=1;j<=3;j++){
                    findMsg1.setGradeId(i);
                    findMsg1.setType(j);
                    allList.addAll(findService.find(findMsg1));
                }
            }
        } else if (gradeId!=0&&type==0) {
            for(int j=1;j<=3;j++){
                findMsg1.setType(j);
                allList.addAll(findService.find(findMsg1));
            }
        }else if (gradeId==0&&type!=0) {
            for(int j=1;j<=6;j++){
                findMsg1.setGradeId(j);
                allList.addAll(findService.find(findMsg1));
            }
        }else
            allList.addAll(findService.find(findMsg1));
    return allList;
    }
}
