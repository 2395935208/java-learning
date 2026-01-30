package com.text.mypackage;

import java.util.Scanner;

public class 数组索引 {
    /*
    已知数组元素{18,24,63,75,52,18}
    键盘录入任意一个数字，查找这个数据是否存在
    如果要查找的数据出现多次，只显示第一次的索引
    输出要求
    如果存在打印索引
    如果不存在提示“该数据不存在”
     */
    public static void main(String[]args){
        //定义该数组
        int arr[]={18,24,63,75,52,18};
        //键盘录入数字
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num=sc.nextInt();
        //定义一个变量记录索引
        int count=0;
        //查找数据
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                System.out.println(i);
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("该数据不存在");
        }
    }
}
