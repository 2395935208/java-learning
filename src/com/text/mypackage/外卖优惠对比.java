package com.text.mypackage;

import java.util.Scanner;
public class 外卖优惠对比 {
    public static void main(String[] args) {
        /*
        小明每次点外卖之前都会上不同平台对比谁的优惠力度大
        已知：饿了么全场九折优惠
        美团满三十减十
         */
        //问题一：小明买了50块的烧烤，哪家更便宜？
        Scanner sc=new Scanner(System.in);
        double price =sc.nextDouble();
        double price1 = 9 * price / 10;
        double price2=0;
        if(price<30){
            price2=price;
        }else{
            price2=price-10;
        }
        System.out.println("饿了么的优惠价格是：" + price1);
        System.out.println("美团外卖的优惠价格是：" + price2);
        if(price1<price2){
            System.out.println("饿了么的优惠价格更便宜");
        }else{
            System.out.println("美团外卖的优惠价格更便宜");
        }

    }
}
