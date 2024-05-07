package com.calculator.service.util;

import java.util.ArrayList;
import java.util.List;

public class NumberUtil {

    public static void main(String[] args) {
        //0-10之内,随机取五个数
        List<Integer> integers = randomCommon(1, 1496255, 200);
        if (integers != null && integers.size() != 0) {
            for (int i : integers) {
                System.out.println(i + ",");
            }
        } else {
            System.out.println("kk");
        }
    }

    /**
     * 随机指定范围内N个不重复的数
     *
     * @param min 指定范围最小值
     * @param max 指定范围最大值
     * @param n   随机数个数
     * @return
     */
    public static List<Integer> randomCommon(int min, int max, int n) {
        List<Integer> integers = new ArrayList<Integer>();
        if (min < 0) {
            min = 0;
        }
        if ((max - min) + 1 < n) {
            n = (max - min) + 1;
        }
        if (max < min) {
            max = min;
        }
        if (max < 0 || n < 0) {
            return integers;
        }
        for (int i = 1; i <= n; i++) {
            int randomNumber = (int) Math.round(Math.random() * (max - min) + min);
            if (integers.contains(randomNumber)) {
                i--;
                continue;
            } else {
                integers.add(randomNumber);
            }
        }
        return integers;
    }
}
