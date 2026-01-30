package com.text.mypackage;

import java.util.Scanner;

public class 计算班级分数 {
    /*
    班主任要统十名学生的数学成绩（0~100）计算及格率，平均分并找出最高分
     */
    public static void main(String[]args){
        //键盘录入十名学生的成绩，存入数组，超出范围的提示“成绩无效，请重新输入”
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"名学生的成绩：");
            int score=sc.nextInt();
            //判断是否超出范围
            if(score<0||score>100){
                System.out.println("成绩无效，请重新输入：");
                i--;
            }else{
                arr[i]=score;
            }
        }
        //调用及格人数方法
        int getCount=getCount(arr);
        System.out.println("及格人数为："+getCount);
        //及格率
        double getRate=getCount/(double)arr.length;
        System.out.println("及格率是："+getRate);
        //求平均分
        double average=getSum(arr)/(double)arr.length;
        System.out.println("平均分是："+average);
        //求最大值
        int max=getMax(arr);
        System.out.println("最高分是："+max);
    }
    //定义方法求及格人数
    public static int getCount(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=60){
                count++;
            }
        }
        return count;
    }
    //定义方法求总分
    public static int getSum(int arr[]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    //定义方法求最大值
    public static int getMax(int arr[]){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
