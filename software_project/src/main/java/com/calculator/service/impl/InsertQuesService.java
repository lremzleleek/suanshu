package com.calculator.service.impl;

import com.calculator.mapper.InsertQuesMapper;
import com.calculator.pojo.message.InsertQuesMsg;
import com.calculator.pojo.question.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsertQuesService {
    @Autowired
    private InsertQuesMapper insertQuesMapper;

    public boolean InsertQues(InsertQuesMsg insertQuesMsg) {
        List<AllQues> list=insertQuesMsg.getList();
        boolean[] listBool =insertQuesMsg.getAccuracy();
        String[] listStr=insertQuesMsg.getUserResult();
        int k=0;
        boolean flag=true;
        for(AllQues iqm:list){
            if(insertQuesMapper.insertQues(insertQuesMsg,iqm.getId(),listStr[k],listBool[k++])!=true)
            {
                flag=false;break;
            }
        }

       return flag;
    }
}
