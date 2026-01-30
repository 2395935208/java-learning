package com.text.mypackage;

import java.util.Scanner;

public class 数值拆分 {
    public static void main(String[]args){
        /*
        要求：键盘录入一个三位数，将这个三位数拆分成个位十位百位
        */
        //创建Scanner类
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number=sc.nextInt();
        //拆分数字，获取个位
        int ge=number%10;
        //获取十位
        int shi=number/10%10;
        //获取百位
        int bai=number/100%10;
        System.out.println("个位是："+ge);
        System.out.println("十位是："+shi);
        System.out.println("百位是："+bai);
    }
}
