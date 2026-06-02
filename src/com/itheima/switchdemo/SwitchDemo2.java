package com.itheima.switchdemo;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        /*输入月份判断季节
         * 3-5月为春季
         * 6-8 月为夏季
         * 8-10月为秋季
         * 12-2月为冬季
                 */
        /*利用了case的穿透性,节省了代码量
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:5

            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
