package com.itheima.operator;

import java.util.Scanner;

public class OperatorDemo4 {
        public static void main(String[] args) {
                //1.键盘录入两人身高
                Scanner sc = new Scanner(System.in);

                System.out.println("请输入两人身高");
                double height1 = sc.nextDouble();
                double height2 = sc.nextDouble();

                //2.比较谁更高
                boolean b = (height1 >= height2);
                System.out.println(b);
        }
}

