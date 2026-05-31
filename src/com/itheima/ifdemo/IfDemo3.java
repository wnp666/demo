package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args) {
        //定义学生成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        double salary = sc.nextDouble();
        if(salary>=0 && salary<=100) {
            if (salary >= 60) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
        } else {
            System.out.println("成绩有误");
        }
        sc.close();
    }
}
