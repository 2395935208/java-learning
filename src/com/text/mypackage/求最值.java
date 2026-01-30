package com.text.mypackage;

public class 求最值 {
    /*
    给定一个数组，在里面求出最值
     */
    public static void main(String[]args){
        //定义数组
        int arr[]={18,23,31,22,56,77};
        //先去第一个数作为最大值
        int max=arr[0];
        //用for循环遍历来依次比较
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("最大值为："+max);
    }
}
