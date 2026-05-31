package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo4 {
    public static void main(String[] args) {
        /*
           需求：小明点外卖，在多家平台对比价格，选择价格最低的
           已知：
                饿了吗：全场9折
                美团：满30减10元
            请问1.小明一顿花了50，选哪家平台
            请问2.如果价格不确定，数据由键盘录入而来呢

         */
        System.out.println("情况一");

        double price = 50;
        double price1 = price * 0.9;
        double price2 = price - 10;
        if (price1 < price2) {
            System.out.println("小明选择饿了吗");
        } else {
            System.out.println("小明选择美团");
        }
        System.out.println("-----------------");
        System.out.println("情况二");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的外卖价格：");
        double Price = sc.nextDouble();
        double Price1 = Price * 0.9;
        double Price2 = Price - 10;
        if (Price1 < Price2) {
            System.out.println("小明选择饿了吗");
        } else {
            System.out.println("小明选择美团");

        }
    }
}
