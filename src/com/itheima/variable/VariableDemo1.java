package com.itheima.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        /*  微信余额：0元
            支付宝余额：10元
            银行卡余额：20元
            问题一：请问现在一共有多少钱？
            问题二：微信收了10元红包，又发了2元红包，余额多少？ */
//        定义一个变量记录微信余额
        int wechatBalance = 0;
//        定义一个变量记录支付宝余额
        int alipayBalance = 10;
//        定义一个变量记录银行卡余额
        int bankCardBalance = 20;
//        计算总余额
        int totalBalance = wechatBalance + alipayBalance + bankCardBalance;
//        输出总余额
        System.out.println("总余额为：" + totalBalance + "元");
//        计算微信余额
        wechatBalance = wechatBalance + 10 - 2;
//        输出微信余额
        System.out.println("微信余额为：" + wechatBalance + "元");
    }
}
