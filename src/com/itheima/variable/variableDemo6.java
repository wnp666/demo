package com.itheima.variable;

import java.util.Scanner;

public class variableDemo6 {
    static void main(String[] args) {
        /*
            键盘录入:
              1.找到scanner这个打工人
               2.让scanner干活
         */

        //1.找到scanner这个打工人
        Scanner sc = new Scanner(System.in);
        //2.让scanner干活

        //录入一个整数
        //int a=sc.nextInt();
        //System.out.println(a);

        //录入一个浮点数
       // double b=sc.nextDouble();
        //System.out.println(b);

        //录入一个(文本)字符串
        String str=sc.next();
        System.out.println(str);


    }
}
