package com.text.mypackage;

import java.util.Scanner;
public class 计算bmi {
    public static void main(String[]args){
        //创建scanner类
        Scanner sc=new Scanner(System.in);
        //输入身高
        System.out.println("请输入您的身高（米）：");
        double height=sc.nextDouble();
        //输入体重
        System.out.println("请输入您的体重（kg）");
        double weight=sc.nextDouble();
        //算bmi
        double BMI=weight/(height*height);
        System.out.println("您的BMI值为："+BMI);
    }
}
