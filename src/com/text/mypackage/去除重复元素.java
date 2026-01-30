package com.text.mypackage;

import java.util.Random;

public class 去除重复元素 {
    /*
    要求：
    生成10个1-100之间的数字，并存到数组中，保证每个数据都是唯一的
     */
    public static void main(String[]args){
        //定义一个数组
        int arr[]=new int[10];
        //生成随机数
        Random r=new Random();
        //生成十个数字
        for (int i = 0; i < arr.length;) {
            int num=r.nextInt(100)+1;
            //定义变量存储重复的次数
            int count=0;
            //判断是否重复
            for(int j=0;j<i;j++){
                if(num==arr[j]){
                    count++;
                    break;
                }
            }
            if(count==0){
                arr[i]=num;
                i++;
            }


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
