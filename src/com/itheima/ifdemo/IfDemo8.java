package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形的三边长：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //判断是否能构成三角形
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("能构成三角形");
            //判断三角形的类型
            //等腰三角形
            //等边三角形
            //直角三角形
            //普通三角形
            if (a == b && a == c) {
                System.out.println("是等边三角形");
            } else if (a == b || a == c || b == c) {
                System.out.println("是等腰三角形");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("是直角三角形");
            } else {
                System.out.println("是普通三角形");
            }
        } else {
            System.out.println("不能构成三角形");
        }
    }
}
