package com.text.mypackage;

import java.util.Scanner;

public class switch新特性 {
    /*
    判断当前月份是哪个季节
     */
    public static void main(String[]args){
        //键盘录入季节
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int month=sc.nextInt();
        //；用switch的新特性
        String name=switch(month){
            case 1,2,3->{
                yield"春季";
            }
            case 4,5,6->{
                yield"夏季";
            }
            case 7,8,9->{
                yield"秋季";
            }
            case 10,11,12->{
                yield"冬季";
            }
            default->{
                yield"输入的数字有误";
            }
        };
        System.out.println(name);
    }

}
