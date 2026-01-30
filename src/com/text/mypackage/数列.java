package com.text.mypackage;

import java.util.Scanner;

public class 数列 {
    /*
    s（n）=-1+2-3+4.....,求第n个时s（n）是多少
     */
    public static void main(String[]args){
        //键盘录入n
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n=sc.nextInt();
        //定义变量求和
        int sum=0;
        //循环
        for(int i=1;i<=n;i++){
            //判断奇数还是偶数
            if(i%2==1){
                sum=sum-i;
            }else{
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
