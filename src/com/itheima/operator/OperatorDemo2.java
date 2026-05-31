package com.itheima.operator;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入总秒数：");
        int seconds = sc.nextInt();

        // 计算小时数
        int hours = seconds / 3600;

// 计算去掉整小时后的剩余秒数
        int remainingSecondsAfterHours = seconds % 3600;

// 计算分钟数（这里需要你自己填）
        int minutes = remainingSecondsAfterHours / 60;

// 计算最终秒数（这里需要你自己填）
        int finalSeconds = remainingSecondsAfterHours % 60;

        System.out.println("总时间为：" + hours + "小时" + minutes + "分" + finalSeconds + "秒");

    }
}
