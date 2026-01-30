package com.text.mypackage;

import java.util.Scanner;

public class 判断质数 {
    public static void main(String[] args) {
        /*
        键盘录入一个大于等于二的数字，判断是否为质数
         */
        //键盘录入数字
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int n=sc.nextInt();
        //判断是否为质数
        //定义一个变量纪录被整除的次数
        int num=0;
        //2~n-1中没有可以被n整除的数字，就可以证明是质数
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                num++;
            }
        }
        if(num==0){
            System.out.println(n+"是质数");
        }else{
            System.out.println(n+"不是质数");
        }
    }
}
