package com.itheima.operator;

import java.util.Scanner;

public class OperatorDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 判断是否在1~10之间（包含1和10）
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        if (a <= 10 && a >= 1) {
            System.out.println("在1~10之间");
        } else {
            System.out.println("不在1~10之间");
        }

        // 2. 判断是否不在1~10之间（修正逻辑）
        System.out.println("请输入一个整数：");
        int b = sc.nextInt();
        if (b <= 0 || b >= 11) { // 等价于 b < 1 || b > 10
            System.out.println("不在1~10之间");
        } else {
            System.out.println("在1~10之间");
        }

        sc.close();
    }
}