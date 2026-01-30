package com.text.mypackage;

public class 逢七过 {
    /*
    循环打印1~100的数字，碰到带有七或七的倍数的数字则跳过
     */
    //循环打印数字
    public static void main(String[]args){
        for(int i=1;i<=100;i++){
            //进行判断
            if(i%7==0||i%10==7){
                continue;
            }
            System.out.println(i);
        }
    }
}
