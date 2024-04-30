package com.calculator.service.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SplitUtil {

    public static int[] splitIntoParts(int total, int numParts) {
        if (total < 0 || numParts <= 0 || total < numParts) {
            throw new IllegalArgumentException("Invalid input parameters");
        }

        List<Integer> parts = new ArrayList<>(numParts);
        Random random = new Random();

        // 首先分配一个随机部分，但确保剩余部分足够分配给其他部分
        int remaining = total;
        for (int i = 0; i < numParts - 1; i++) {
            // 生成一个随机数（1到remaining-numParts+i+1之间），以确保最后一部分至少为1
            int part = random.nextInt(remaining - numParts + i + 1) + 1;
            parts.add(part);
            remaining -= part;
        }

        // 最后一部分就是剩余的部分
        parts.add(remaining);

        // 如果需要，可以对数组进行随机排序
        // Collections.shuffle(parts, random);

        // 将List转换为数组
        int[] result = new int[parts.size()];
        for (int i = 0; i < parts.size(); i++) {
            result[i] = parts.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int total = 100;
        int numParts = 5;
        int[] parts = splitIntoParts(total, numParts);
        for (int part : parts) {
            System.out.println(part);
        }
    }
}