package com.text.mypackage;

import java.util.Scanner;

public class 统计练习 {
    /*
    键盘录入两个数字，求两个数字之间有多少个是能被3和5整除的
     */
    public static void main(String[]args){
        //键盘录入两个数字
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1=sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2=sc.nextInt();
        //判断两个数字哪个大哪个小
        int min=num1<num2?num1:num2;
        int max=num1>num2?num1:num2;
        //遍历这些数字看给哪些是能同时被3和5整除的1
        int count=0;
        for(int i=min;i<=max;i++){
            if(i%3==0&&i%5==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("在"+min+"~"+max+"之间没有能被3和5整除的数字");
        }else{
            System.out.println("在"+min+"~"+max+"之间有"+count+"个能被3和5整除的数字");
        }
    }
}
