package com.text.mypackage;

public class 移除元素 {
    /*
    给一个数组nums和一个值val，需要删除所有数值等与val的元素
     */
    public static void main(String[]args){
        //定义一个数组
        int arr[]={3,4,5,6,5,6,7,8,6,6,9,};
        //定义要删除的数值
        int val=6;
        //使用快慢指针
        int slow=0;//慢指针为存入的位置
        int fast=0;//快指针找不重复的数据
        while(fast<arr.length){
            //判断快指针上的元素是否要删除
            if(arr[fast]!=val){
                arr[slow]=arr[fast];
                slow++;
            }
            fast++;
        }
        System.out.println(slow);
        for (int i = 0; i < slow; i++) {
            System.out.println(arr[i]);
        }
    }
}
