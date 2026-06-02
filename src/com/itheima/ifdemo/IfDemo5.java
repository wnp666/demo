package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入一个整数
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        //判断奇偶，奇数则f(n)=3n+1;偶数则f(n)=n/2
        if(n%2==0){
            int num = n/2;
            System.out.println("num="+num);
        }else{
            int num = 3*n+1;
            System.out.println("num="+num);
        }
    }
}
