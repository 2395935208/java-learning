package com.text.mypackage;

import java.util.Random;

public class 打乱数组中的元素 {
    /*
    给定一个数组，打乱其中的元素
     */
    public static void main(String []args){
        //定义数组
        int arr[]={2,43,12,5,6,7,8,9,10};
        //定义临时变量
        int temp=0;
        //生成随机数
        Random r=new Random();
        //循环数组遍历
        for (int i = 0; i < arr.length; i++) {
            temp=arr[i];
int randomIndex=r.nextInt(arr.length);
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        //打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
