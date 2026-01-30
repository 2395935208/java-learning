package com.text.mypackage;

public class 中位数 {
    /*
    给两个正序数组arr1和arr2，先合并数组，再找出合并之后的中位数（奇数和偶数的情况不一样）
     */
    public static void main(String[]args){
        //定义两个数组
        int arr1[]={1,2,3,4,5,6,7,8,9};
        int arr2[]={2,4,6,8,10,12};
        //将两个数组合并
        int arr3[]=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        //while循环
        while(i<arr1.length&&j<arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        //判断那个还有剩余
            while(i<arr1.length){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            while(j<arr2.length){
                arr3[k]=arr2[j];
                j++;
                k++;
            }
            //奇数还是偶数分情况
        if(arr3.length%2==1){
            double mid=arr3[arr3.length/2];
            System.out.println("中位数为："+mid);
        }else{
            int left=(arr3.length-1)/2;
            int right=(arr3.length-1)/2+1;
            double mid=(arr3[left]+arr3[right])/2.0;
            System.out.println("中位数为："+mid);
        }
        }
    }
