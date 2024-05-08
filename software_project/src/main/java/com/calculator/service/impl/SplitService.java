package com.calculator.service.impl;

import com.calculator.mapper.*;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.DualAdd;
import com.calculator.pojo.question.DualMul;
import com.calculator.pojo.question.SeqNoPar;
import com.calculator.pojo.question.SeqWithPar;
import com.calculator.service.util.NumberUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.calculator.service.util.SplitUtil.splitIntoParts;

@Component
public class SplitService {
    @Autowired
    private DualAddMapper dualAddMapper;
    @Autowired
    private DualMulMapper dualMulMapper;
    @Autowired
    private SeqNoParMapper seqNoParMapper;
    @Autowired
    private SeqWithParMapper seqWithParMapper;
    @Autowired
    private RandomMapper randomMapper;

    public List<Object> selectSplit(ExerciseMsg exerciseMsg) {
        String[] tablename=new String[4];
        int splitNum=0;
        List<Object> alllist=new ArrayList<>();
        switch (exerciseMsg.getGradeId()) {
            case 1: tablename[0]="tenadd";tablename[1]="tensub";
                break;
            case 2: tablename[0]="hunaddnine";tablename[1]="hunaten";
            tablename[2]="hunsubnine";tablename[3]="hunsten";
                break;
            case 4: tablename[0]="hunaddsub";tablename[1]="hunaskuohao";
            tablename[2]="hunmutandiv";tablename[3]="hunmutandivkuohao";
                break;
            case 5: tablename[0]="hunzerotwo";tablename[1]="hunzeroone";
                tablename[2]="tenmutone";tablename[3]="tenmutwo";
                break;
            case 6: tablename[0]="tendivone";tablename[1]="hunzdivone";
                tablename[2]="hundivone";
                break;
            default:return null;
        }
        for(String i:tablename){
        if(i!=null){
            splitNum++;
            }
        }

        int[] intList=splitIntoParts(exerciseMsg.getQuesNum(),splitNum);

        for(int i=0;i<intList.length;i++){
            Integer minNum=randomMapper.getMinNum(tablename[i]);
            Integer maxNum=randomMapper.getMaxNum(tablename[i]);
            List<Integer> list= NumberUtil.randomCommon(minNum,maxNum,intList[i]);
            if(tablename[i].equals("hunaddsub")||tablename[i].equals("hunmutandiv")){
                for (Integer integer : list) {
                    SeqNoPar temp;
                    temp=seqNoParMapper.selectSeqNoPar(tablename[i], integer);
                    temp.setGradeId(exerciseMsg.getGradeId());
                    temp.setQuesId(exerciseMsg.getQuesId());
                    alllist.add(temp);
                }
            }
            else if(tablename[i].equals("hunaskuohao")||tablename[i].equals("hunmutandivkuohao")){
                for (Integer integer : list) {
                    SeqWithPar temp;
                    temp=seqWithParMapper.selectSeqWithPar(tablename[i], integer);
                    temp.setGradeId(exerciseMsg.getGradeId());
                    temp.setQuesId(exerciseMsg.getQuesId());
                    alllist.add(temp);
                }
            }
            else if(exerciseMsg.getGradeId()==1||exerciseMsg.getGradeId()==2){
                for (Integer integer : list) {
                    DualAdd temp;
                    temp=dualAddMapper.selectDualAdd(tablename[i], integer);
                    temp.setGradeId(exerciseMsg.getGradeId());
                    temp.setQuesId(exerciseMsg.getQuesId());
                    alllist.add(temp);
                }
            }
            else if(exerciseMsg.getGradeId()==5||exerciseMsg.getGradeId()==6){
                    for (Integer integer : list) {
                        DualMul temp;
                        temp=dualMulMapper.selectDualMul(tablename[i], integer);
                        temp.setGradeId(exerciseMsg.getGradeId());
                        temp.setQuesId(exerciseMsg.getQuesId());
                        alllist.add(temp);
                    }
            }
        }
        return alllist;
        }


}
