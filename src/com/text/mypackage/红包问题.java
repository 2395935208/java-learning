package com.text.mypackage;

import java.util.Random;

public class 红包问题 {
    /*
    给两个整数M和N，M表示红包的总额，N表示红包的个数
    有N个人来抽红包，金额随机，打印每个红包的金额
    要求：1.每人最少一分钱
    2.每个人领完红包后，至少留下1*N分钱
    3，最后一个人把最后剩下的全拿走
     */
    public static void main(String[]args){
        //定义M和N
        int M=100;//单位是分
        int N=5;
        Random r=new Random();
        //先判断是否满足条件
        if(M<N){
            System.out.println("金额不足，无法分配");
            return;
        }
        for(int i=0;i<N;i++){
            //判断是否为最后一个人
            if(i!=N-1){
                //每个人最少一分钱，至少留下1*N分钱
                int money=r.nextInt(M-(N-i-1))+1;
                System.out.println(money);
                //每抽走一个个红包剩余金额变少
                M-=money;
            }else{
                System.out.println(M);
            }
        }
    }
}
