package com.calculator.service.impl;

import org.springframework.stereotype.Component;

@Component
public class TableSearch {
    public String TableSearch(int gradeId,int quesId) {
        switch (gradeId) {
            case 1:
                switch (quesId) {
                    case 1: return "fivecom";
                    case 2: return "fiveadd";
                    case 3: return "fivesub";
                    case 4: return "fivezero";
                    case 5: return "tencom";
                    case 6: return "tenadd";
                    case 7: return "tensub";
                    case 9: return "tenaddsub";
                    case 10: return "tenaa";
                    case 11: return "tweaddorsub";
                    case 12: return "twecom";
                    case 13: return "tweaaorss";
                    default: throw new IllegalArgumentException("Invalid quesId for the provided cases");
                }
            case 2:
                switch (quesId) {
                    case 1: return "huncom";
                    case 2: return "hunaddorsub";
                    case 3: return "hunaddten";
                    case 4: return "hunaddnine";
                    case 5: return "hunaten";
                    case 6: return "hunsubnine";
                    case 7: return "hunsten";
                    case 9: return "hunaaoss";
                    default: throw new IllegalArgumentException("Invalid quesId for the provided cases");
                }
            case 3:
                switch (quesId) {
                    case 1: return "hunaddhun";
                    case 2: return "hunsubhun";
                    case 3: return "hunajinwei";
                    case 4: return "hunstuiwei";
                    case 5: return "hunaddsub";
                    case 6: return "fivemut";
                    case 7: return "tenmut";
                    case 8: return "mutaddsub";
                    default: throw new IllegalArgumentException("Invalid quesId for the provided cases");
                }
            case 4:{
                switch (quesId) {
                    case 1: return "nndiv";
                    case 2: return "hunaddsub";
                    case 3: return "hunaskuohao";
                    case 4: return "hunmutandiv";
                    case 5: return "hunmutandivkuohao";
                    case 6: return null;
                    default: throw new IllegalArgumentException("Invalid quesId for the specified cases");
                }
            }
            case 5:{
                switch (quesId) {
                    case 1: return "toaddto";
                    case 2: return "tosubto";
                    case 3: return "tooaddtoo";
                    case 4: return "toosubtoo";
                    case 5: return "thoaddone";
                    case 6: return "thoaddtwo";
                    case 7: return "thosone";
                    case 8: return "thostwo";
                    case 9: return "zeromut";
                    case 10: return "hunzerotwo";
                    case 11: return "hunzeroone";
                    case 12: return "tenmutone";
                    case 13: return "tenmuttwo";
                    case 14: return null;
                    case 15: return "fenshucom";
                    case 16: return "fenshuadd";
                    case 17: return "fenshusub";
                    default: throw new IllegalArgumentException("Invalid quesId for the given cases");
                }
            }
            case 6:{
                switch (quesId) {
                    case 1: return "tendivone";
                    case 2: return "hunzdiveone";
                    case 3: return "hundiveone";
                    case 4: return "hundiveonez";
                    case 5: return "hundiveonezz";
                    case 6: return null;
                    case 7: return "xiaoshu";
                    default: throw new IllegalArgumentException("Invalid quesId for the specified cases");
                }
            }
            default:
                throw new IllegalArgumentException("Invalid gradeId");

        }
    }
}
