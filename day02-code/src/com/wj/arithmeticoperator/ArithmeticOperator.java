package com.wj.arithmeticoperator;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        // +
        System.out.println(3 + 2);//5
        // -
        System.out.println(5 - 1);//4
        // * (shift + 数字8)
        System.out.println(7 * 9);//63

        //如果在计算的时候有小数参与
        //结论：
        //在代码中，如果有小数参与计算，结果有可能不精确的。
        //为什么呢？
        //暂时只要知道这个结论就可以了。
        //具体的原因，我们到了JavaSE的时候，会再详细的讲解
        System.out.println(1.1 + 1.1);//2.2
        System.out.println(1.1 + 1.01);//2.1100000000000003
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
        // 除法
        System.out.println(10 / 2); // 5
        System.out.println(10 / 3); // 3
        System.out.println(10.0 / 3); // 3.3333333333333335

        // 取模，取余。实际上也是做除法运算，只不过得到的是余数而已。
        System.out.println(10 % 2); // 0
        System.out.println(10 % 3); // 1

        // 应用场景：
        // 1. 可以用取模来判断，A是否可以被B整除
        // A % B   10 % 3
        // 2. 可以判断A是否为偶数
        // A % 2 如果结果为0，那么证明A是一个偶数。如果结果为1，那么证明A是一个奇数
        // 3. 在以后，斗地主发牌
        // 三个玩家
        // 把每一张牌都定义一个序号
        // 拿着序号 % 3 如果结果为1，就发给第一个玩家。
        // 如果结果为2，那么就发给第二个玩家
        // 如果结果为0，那么就发给第三个玩家

//        小练习
        System.out.println("请输入一个三位整数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num % 10;
        System.out.println("整数的个位数是：" + num1);
        int num2 = (num / 10) % 10;
        System.out.println("整数的十位数是：" + num2);
        int num3 = num / 100;
        System.out.println("整数的百位数是：" + num3);
        



    }
}