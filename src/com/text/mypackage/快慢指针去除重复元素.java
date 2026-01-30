package com.text.mypackage;

public class 快慢指针去除重复元素 {
    /*
    给定递增有序数组，用快慢指针去重重复元素
     */
    public static void main(String[]args){
        //定义数组
        int arr[]={1,2,2,2,2,3,3,4,4,5,5,5,5};
        //定义快慢指针
        int slow=0;
        int fast=1;
        //遍历数组
        while(fast<arr.length){
            //判断相不相等
            if(arr[slow]!=arr[fast]){
              slow++;
              arr[slow]=arr[fast];
            }
            fast++;
        }
        for (int i = 0; i < slow+1; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
