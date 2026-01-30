package com.text.mypackage;

import java.util.Scanner;

public class 评委打分 {
    /*
    跳水比赛五个评委打分，分数在0~100之间，最终得分会去掉一个最低分，去掉一个最高分，剩余分数求平均数，平均数为选手最终得分
     */
    public static void main(String[]args){
        //1.录入五个整数存到数组中，分数超出范围需要重新录入
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        //用循环依次录入分数
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个评委的分数：");
            int score=sc.nextInt();
            //判断分数是否在范围之内
            if(score<0||score>100){
                System.out.println("输入的分数超出范围，请重新输入：");
                i--;
            }else{
                arr[i]=score;
            }
            }
  //用方法获取最大值和最小值
        int max=getMax(arr);
        int min=getMin(arr);
        //3.计算五名评委的总分
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        //4.求平均分
        double avarge=(sum-min-max)/3;
        System.out.println("最终得分为："+avarge);
        }
        public static int getMax(int arr[]){
        int max=arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
        return max;
        }
        public static int getMin(int arr[]){
        int min=arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(min>arr[i]){
                    min=arr[i];
                }
            }
            return min;
        }
    }
