package com.calculator.service.impl;

import com.calculator.mapper.CompareMapper;
import com.calculator.mapper.DualAddMapper;
import com.calculator.mapper.RandomMapper;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.DualAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DualAddService{
    @Autowired
    private DualAddMapper dualAddMapper;

    @Autowired
    private RandomMapper randomMapper;

    private String tablename;


    public List<DualAdd> selectDualAdd(ExerciseMsg exerciseMsg) {
        switch (exerciseMsg.getGradeId()) {
            case 1: {
                switch (exerciseMsg.getQuesId()) {
                    case 2:
                        tablename = "fiveadd";
                        break;
                    case 3:
                        tablename = "fivesub";
                        break;
                    case 4:
                        tablename = "fivezero";
                        break;
                    case 6:
                        tablename = "tenadd";
                        break;
                    case 7:
                        tablename = "tensub";
                        break;
                    //case 8: tablename=" ";break;
                    case 10:
                        tablename = "tenaa";
                        break;
                    case 11:
                        tablename = "tweaddorsub";
                        break;
                }
            }
            break;
            case 2: {
                switch (exerciseMsg.getQuesId()) {
                    case 2:
                        tablename = "hunaddorsub";
                        break;
                    case 3:
                        tablename = "hunaddten";
                        break;
                    case 4:
                        tablename = "hunaddnine";
                        break;
                    case 6:
                        tablename = "hunsubnine";
                        break;
                    case 5:tablename="hunaten";break;
                    case 7:tablename="hunsten";break;
                }
            }
            break;
            case 3: {
                switch (exerciseMsg.getQuesId()) {
                    case 1:
                        tablename = "hunaddhun";
                        break;
                    case 2:
                        tablename = "hunsubhun";
                        break;
                    case 3: tablename="hunajinwei";break;
                    case 4: tablename="hunstuiwei";break;
                }
            }
            break;
            case 5: {
                switch (exerciseMsg.getQuesId()) {
                    case 1:
                        tablename = "toaddto";
                        break;
                    case 2:
                        tablename = "tosubto";
                        break;
                    case 3: tablename="tooaddtoo";break;
                    case 4: tablename="toosubtoo";break;
                    case 5:tablename="thoaddone";break;
                    case 6:tablename="thoaddtwo";break;
                    case 7:tablename="thosone";break;
                    case 8:tablename="thostwo";break;
                }
            }
            break;
            default:
                return null;
        };
        Integer minNum=randomMapper.getMinNum(tablename);
        Integer maxNum=randomMapper.getMaxNum(tablename);
        List<Integer> list=NumberUtil.randomCommon(minNum,maxNum,exerciseMsg.getQuesNum());
        System.out.println(list);

        return dualAddMapper.selectDualAdd(exerciseMsg,tablename,list);
    }
}

//5加法		int num1	char symbol1	int num2
//5减法		int num1	char symbol1	int num2
//0加减		int num1	char symbol1	int num2
//10加法		int num1	char symbol1	int num2
//10减法		int num1	char symbol1	int num2
//10加减		int num1	char symbol1	int num2
//10进位加法		int num1	char symbol1	int num2
//20加减		int num1	char symbol1	int num2