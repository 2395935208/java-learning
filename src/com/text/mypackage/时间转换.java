package com.text.mypackage;

import java.util.Scanner;
public class 时间转换 {
    public static void main(String[]args){
        /*
        要求：键盘录入秒数，把他转换为小时数和分钟数和秒数
         */
        //创建scanner类
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入秒数：");
        int seconds=sc.nextInt();
        //计算小时数
        int hours=seconds/3600;
        //计算分钟数
        int minutes=seconds%3600/60;
        //计算秒数
        int second=seconds%3600%60;
        //输出结果
        System.out.println(hours+"小时"+minutes+"分钟"+second+"秒");
    }
}
