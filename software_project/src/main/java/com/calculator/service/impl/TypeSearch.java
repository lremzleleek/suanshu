package com.calculator.service.impl;

import com.calculator.pojo.question.*;
import org.springframework.stereotype.Service;

@Service
public class TypeSearch {
    public static AllQues typeSearch(int gradeId, int quesId) {
        AllQues type =null;

        switch (gradeId) {
            case 1: {
                switch (quesId) {
                    case 1, 5, 12:
                        type = new Compare();
                        break;
                    case 2, 3, 4, 6, 7, 10, 11:
                        type = new DualAdd();
                        break;
                    case 9:
                        type = new SeqNoPar();
                        break;
                    case 13:
                        type = new MixCom();
                        break;
                    case 8:
                        type = new Split();
                        break;
                }
            }
            break;
            case 2: {
                switch (quesId) {
                    case 1:
                        type =  new Compare();
                        break;
                    case 2, 3, 4, 5, 6, 7:
                        type = new  DualAdd();
                        break;
                    case 8:
                        type =new Split();
                        break;
                    case 9:
                        type = new  MixCom();
                        break;
                }
            }
            break;
            case 3: {
                switch (quesId) {
                    case 1, 2, 3, 4:
                        type = new  DualAdd();
                        break;
                    case 5, 8:
                        type = new  SeqNoPar();
                        break;
                    case 6, 7:
                        type = new  DualMul();
                        break;
                }
            }
            break;
            case 4: {
                switch (quesId) {
                    case 3, 5:
                        type = new  SeqWithPar();
                        break;
                    case 2, 4:
                        type = new  SeqNoPar();
                        break;
                    case 1:
                        type = new  DualMul();
                        break;
                    case 6:
                        type =new Split();
                        break;
                }
            }
            break;
            case 5: {
                switch (quesId) {
                    case 1, 2, 3, 4, 5, 6, 7, 8:
                        type = new  DualAdd();
                        break;
                    case 9, 10, 11, 12, 13:
                        type = new  DualMul();
                        break;
                    case 14:
                        type =new Split();
                        break;
                    case 16, 17:
                        type = new  FraAdd();
                        break;
                    case 15:
                        type = new  FraCom();
                        break;
                }
            }
            break;
            case 6: {
                switch (quesId) {
                    case 1, 2, 3, 4, 5:
                        type =  new DualMul();
                        break;
                    case 7:
                        type = new  DeciCom();
                        break;
                    case 6:
                        type = new Split();
                        break;
                }
            }
            break;
            default:
                type =null;

        }
        return  type;
    }
}
