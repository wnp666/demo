package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        //定义初始最大生命值为200
        int hp = 200;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入收到的伤害值：");
        double damage = sc.nextDouble();
        //判断伤害值是否为负数
        if(damage<0){
            System.out.println("伤害值不能为负数");
            return;
        }

        //判断是否死亡，收到伤害大于初始生命值，则留下1滴血量
        if(damage>=hp){
            System.out.println("角色仅剩1滴血量");

            hp=1;
            System.out.println("当前生命值为："+hp);
        }else{
            System.out.println("未死亡");
            hp-=damage;
            System.out.println("当前生命值为："+hp);
        }

        //技能回复血量，但是最大值不能超过初始生命值
        System.out.println("请输入回复血量：");
        double heal = sc.nextDouble();
        if(hp+heal>200){
            System.out.println("生命值已恢复至最大值");
            hp=200;
            System.out.println("当前生命值为："+hp);
        }else{
            hp+=heal;
            System.out.println("当前生命值为："+hp);
        }
        sc.close();
    }
}
