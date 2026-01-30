package com.text.mypackage;

public class 两数之和 {
    /*
    给定一个数组和一个目标值，在数组中找到和为目标值的两个数，并输出他们的索引
    要求1：输出一对就行
    要求2：输出所有满足要求
     */
    public static void main(String[]args){
        //定义数组
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        //目标值
        int target=10;
        //要求1
        for(int i=0;i<arr.length;i++){
            //内层循环
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.print("索引为："+i+","+j);
                }
            }
            //找到就可以停止
            break;//要求2只用把break去掉就行
        }
    }
}
