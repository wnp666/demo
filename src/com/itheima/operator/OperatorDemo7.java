package com.itheima.operator;

import java.util.Scanner;

public class OperatorDemo7 {
    public static void main(String[] args) {
        //键盘录入一个四位整数，判断是不是回文数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位整数：");
        int a = sc.nextInt();
        int qianwei  = a/1000;
        int baiwei = a%1000/100;
        int  shiwei = a%100/10;
        int gewei = a%10;
        if(qianwei==gewei && baiwei==shiwei){
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
        }


        //寻找7的 有缘数，定义一个两位整数，只要该数字 包含七或者7的倍数，就称为7的有缘数
        System.out.println("请输入一个两位整数：");
        int b = sc.nextInt();
        if(b%7==0 || b/10==7 || b%10==7){
            System.out.println("是7的有缘数");
        }else{
            System.out.println("不是7的有缘数");
        }
    }
}
