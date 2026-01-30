package com.text.mypackage;

import java.util.Scanner;

public class 计算快递邮费 {
    /*
    某快递公司规则如下：首重1kg，超出部分按kg计算，不足1kg按1kg计算
    首重1kg：10元
    超出1-5kg：每kg加2元
    超出5kg以上：每kg加1.5元
    键盘录入小数表示快递重量，计算最终的结果
    要求1：快递重量必须大于0，否则重新输入
    要求2：不同价位的计算，单独定义一个方法
     */
    public static void main(String[]args){
         //键盘录入重量
        System.out.println("请输入快递重量（kg）：");
        Scanner sc=new Scanner(System.in);
        double weigth=sc.nextDouble();
        //判断是否大于0
        if(weigth<=0){
            System.out.println("输入有误，请重新输入大于0的重量");
            weigth=sc.nextDouble();
        }
        double price=0;
        //判断重量再调用对应的方法
        if(weigth<=1){
            price=getPrice1(weigth);
        }else if(weigth>1&&weigth<=5){
            price=getPrice2(weigth);
        }else{
            price=getPrice3(weigth);
        }
        System.out.println("邮费为："+price);
    }
    //定义0-1kg的计算方法
    public static double getPrice1(double weigth){
        return 10;
    }
    //定义1-5kg的计算方法
    public static double getPrice2(double weigth){
        int price=10+(int)(weigth-1)*2;
        return price;
    }
    //定义5kg以上的算法
    public static double getPrice3(double weigth){
        double price=10+20+(int)(weigth-5)*1.5;
        return price;
    }
}
