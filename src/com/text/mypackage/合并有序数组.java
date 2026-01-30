package com.text.mypackage;

public class 合并有序数组 {
    /*
    两个有序数组合并为一个有序数组
     */
    public static void main(String[]args){
        //定义两个数组
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6,8,10};
        //定义新数组
        int[] c = new int[a.length+b.length];
        //1.定义三个指针来比较大小
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        //判断哪个数组还有剩余
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
        //打印数组
        for (int l = 0; l < c.length; l++) {
            System.out.print(c[l]+",");
    }
}
 }
