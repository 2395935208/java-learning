package com.text.mypackage;

import java.util.Scanner;

public class 减肥计划 {
    /*
    小明制定了一周七天的减肥计划
    周一跑步
    周二游泳
    周三慢跑
    周四动感单车
    周五拳击
    周六爬山
    周日好好吃一顿
     */
    public static void main(String[] args) {
        //键盘录入星期数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week=sc.nextInt();
        switch(week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢跑");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("输入的星期数有误");
                break;
        }
    }
}
