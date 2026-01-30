package com.text.mypackage;

public class 查找元素 {
    /*
    给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印索引
    如果目标值不存在，打印应该插入的位置
     */
    public static void main(String[]args){
        //定义数组
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        //定义目标值
        int target=5;
        //定义变量记录插入位置
        int count=0;
        //寻找目标值
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println("目标值索引为："+i);
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("目标值不存在");
            //寻找插入位置
            if (target <= arr[0]) {
                System.out.println("插入位置为：0");
            } else if (target > arr[arr.length - 1]) {
                System.out.println("插入位置为：" + arr.length);
            } else {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] < target && arr[j + 1] >= target) {
                        System.out.println("插入位置为：" + (j + 1));
                        break;
                    }
                }
            }
        }
    }
}
