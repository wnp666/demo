package com.itheima.operator;

import java.util.Scanner;

public class OperatorDemo1 {
    public static void main(String[] args) {
        // 1. 键盘录入一个三位数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();
        System.out.println(number);

        // 2. 拆分
        // 个位
        int ge = number % 10;
        System.out.println("个位：" + ge);

        // 十位
        int shi = number / 10 % 10;
        System.out.println("十位：" + shi);

        // 百位
        int bai = number / 100 % 10;
        System.out.println("百位：" + bai);
    }
}