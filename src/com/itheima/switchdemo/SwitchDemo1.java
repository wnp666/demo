package com.itheima.switchdemo;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        /*键盘输入星期几，判断今天天的减肥计划
        一跑步
        二游泳
        三慢走
        四动感单车
        五拳击
        六爬山
        七休息


                */
            /*
    switch的注意点：
    1. 表达式：结果（字符/整数byte short int/枚举/字符串） --- 跳转表，索引不支持小数，也不支持大的整数long
    2. case：被匹配的值，只能是真实的数据 --- 不能写变量的
    3. case：值不允许重复
    4. break：表示中断，结束的意思，结束switch语句 --- break关键字，作用结束switch语句
    5. default：所有情况都不匹配，执行该处的内容 --- if里面的else是非常类似的
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期几：");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("今天是跑步");
                break;
            case 2:
                System.out.println("今天是游泳");
                break;
            case 3:
                System.out.println("今天是慢走");
                break;
            case 4:
                System.out.println("今天是动感单车");
                break;
            case 5:
                System.out.println("今天是拳击");
                break;
            case 6:
                System.out.println("今天是爬山");
                break;
            case 7:
                System.out.println("今天是休息");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
