package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo6 {
    public static void main(String[] args) {
        /*
            需求：很多App都有不同的优惠券
            假设，现在有以下优惠券
                全场商品满10减8
                全场商品满50减30
                全场商品满100减50
                全场商品满200减90

                会员卡：全场8折
            请问：会员卡和优惠券不能同时使用，最优惠的价格是多少？
         */
        //定义商品价格
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品价格：");
        double price = sc.nextDouble();
        sc.close();

        //使用优惠券可以少付的钱
        double couponPrice = 0;
        if(price>0){
            // 正确写法
            if(price >= 200){
                couponPrice = 90;
            }else if(price >= 100){
                couponPrice = 50;
            }else if(price >= 50){
                couponPrice = 30;
            }else if(price >= 10){
                couponPrice = 8;
            }
        }else {
            System.out.println("商品价格有误");
        }
        System.out.println("使用优惠券可以少付的钱为："+couponPrice);

        // 会员卡：全场8折，可以少付的钱
        double memberPrice = price*0.8;
        System.out.println("会员卡可以少付的钱为："+(price-memberPrice));

        //判断最优惠的价格
        double minPrice = couponPrice;
        if(memberPrice<minPrice){
            minPrice = memberPrice;
        }
        System.out.println("最优惠的价格为："+(price-minPrice));



    }
}
