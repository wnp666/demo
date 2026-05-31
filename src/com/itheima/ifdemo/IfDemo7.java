package com.itheima.ifdemo;
import java.util.Scanner;

public class IfDemo7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入充值金额：");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("充值金额有误");
            return;
        }

        double balance;
        if (n >= 50000) {
            balance = n + 15000;
        } else if (n >= 20000) {
            balance = n + 6000;
        } else if (n >= 10000) {
            balance = n + 2500;
        } else if (n >= 5000) {
            balance = n + 1300;
        } else if (n >= 3000) {
            balance = n + 700;
        } else if (n >= 2000) {
            balance = n + 500;
        } else if (n >= 1000) {
            balance = n + 200;
        } else {
            balance = n; // 不足1000元，无赠送
        }

        System.out.println("卡内余额为：" + balance);
    }
}