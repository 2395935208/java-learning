package com.text.mypackage;

import java.util.Random;

public class 多数据统计 {
    /*
    学生会选主席，有5个候选人
    全校1000名学生参与投票（每人一票，可以弃票）
    0：代表弃票
    1-5：代表选人
    要求1：统计每个候选人的票数和得票率，并找出得票最多的人
    要求2：统计弃票数和弃票率
     */
    public static void main(String[]ags){
        //定义长度为6的数组，不同下标对应不同情况
        int arr[]={0,0,0,0,0,0};
        //生成随机数投票
        Random r=new Random();
        int count=0;
        for(int i=0;i<1000;i++){
            count=r.nextInt(0,6);
            arr[count]++;
        }
        //打印每个人的票数和得票率
        for(int j=1;j<=5;j++){
            System.out.println("候选人"+j+"的票数为："+arr[j]+"，得票率为："+(arr[j]/10.0)+"%");
        }//找出得票最多的人
        int max=1;
        for(int k=2;k<=5;k++){
            if(arr[max]<arr[k]){
                max=k;
            }
        }
        System.out.println("得票最多是："+max+"得票数为："+arr[max]+".得票率为："+(arr[max]/10.0)+"%");
        //统计弃票的人和弃票率
        System.out.println("弃票数为："+arr[0]+"，弃票率为："+(arr[0]/10.0)+"%");
    }
}
