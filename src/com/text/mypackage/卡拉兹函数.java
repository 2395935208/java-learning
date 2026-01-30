package com.text.mypackage;

import java.util.Scanner;

public class 卡拉兹函数 {
    /*
    给定正整数n
    若n为奇数，则f（n）=3*n+1
    若n为偶数，则f（n）=n/2
     */
    public static void main(String[]args){
        //键盘录入一个整数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n=sc.nextInt();
        //判断为奇数还是偶数
        if(n%2==1){
            n=3*n+1;
        }else{
            n/=2;
        }
        System.out.println(n);
    }
}
