package com.text.mypackage;

public class 接雨水 {
    /*
    给定n个非负整数作为宽度为一的柱子的高，计算按此排列的柱子图，下雨之后能接到多少雨水
    思路：分别在左右两端假设一堵无限高度的墙，分别计算出留下了的水和柱子的数量
    再把二者放一起取交集，去掉柱子的数量就是最后剩下的水的数量
     */
    public static void main(String[]args){
        //定义一个数组表示柱子的高度
        int arr[]={0,1,0,1,2,0,1,3,0,2,0,1};
        //先假设右边有一堵墙
        int right[]=new int[arr.length];
        //定义一个数字记录墙的高度
        int count1=0;
        for(int i=0;i<arr.length;i++){
            //与柱子高度比较,谁的数值大记谁
            if(count1<arr[i]) {
                count1=arr[i];
            }
            right[i]=count1;
            System.out.print(right[i]+",");
        }
        System.out.print("\n");
        //同样假设左边有一堵墙
        int left[]=new int[arr.length];
        int count2=0;
        for (int i =arr.length-1; i>=0;i--){
            if(count2<arr[i]){
                count2=arr[i];
            }
            left[i]=count2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(left[i]+",");
        }
        //两个数组一一对比选较小的
        int water[]=new int[arr.length];
        System.out.print("\n");
        for (int i = 0; i < arr.length; i++) {
            if(left[i]<right[i]){
                water[i]=left[i];
            }else{
                water[i]=right[i];
            }
                System.out.print(water[i]+",");
        }
        //减去柱子的高度
        System.out.print("\n");
        for (int i = 0; i < arr.length; i++) {
            water[i]-=arr[i];
            System.out.print(water[i]+",");
        }
    }
}
