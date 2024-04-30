package com.calculator.service.impl;

import com.calculator.mapper.*;
import com.calculator.pojo.message.ExerciseMsg;
import com.calculator.pojo.question.SeqWithPar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.calculator.service.impl.SplitUtil.splitIntoParts;

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
    private String[] tablename=new String[4];
    private int splitNum=0;
    private List<Object> alllist;
    public List<Object> selectSplit(ExerciseMsg exerciseMsg) {
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
                tablename[2]="tenmutone";tablename[3]="tenmuttwo";
                break;
            case 6: tablename[0]="tendivone";tablename[1]="hunzdiveone";
                tablename[2]="hundiveone";
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
            List<Integer> list=NumberUtil.randomCommon(minNum,maxNum,intList[i]);
            if(tablename[i].equals("hunaddsub")||tablename[i].equals("hunmutandiv")){
                alllist.add(seqNoParMapper.selectSeqNoPar(exerciseMsg,tablename[i],list));
            }
            else if(tablename[i].equals("hunaskuohao")||tablename[i].equals("hunmutandivkuohao")){
                alllist.add(seqWithParMapper.selectSeqWithPar(exerciseMsg,tablename[i],list));
            }
            else if(exerciseMsg.getGradeId()==1||exerciseMsg.getGradeId()==2){
                alllist.add(dualAddMapper.selectDualAdd(exerciseMsg,tablename[i],list));
            }
            else if(exerciseMsg.getGradeId()==5||exerciseMsg.getGradeId()==6){
                alllist.add(dualMulMapper.selectDualMul(exerciseMsg,tablename[i],list));
            }
        }
        return alllist;
        }


}
