package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体温：");
        double bodytemperature = sc.nextDouble();
        if(bodytemperature>=38){
            System.out.println("体温异常");
        }else{
            System.out.println("体温正常");
        }
        sc.close();
    }
}
