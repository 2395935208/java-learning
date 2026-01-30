package com.text.mypackage;

import java.util.Scanner;

public class 人物血量 {
    /*
    人物初始血量为200，受到x点伤害，技能恢复y点血，人物不会死亡，血量最低为1点血
    问：人物最终的血量为多少？
     */
    public static void main(String[]args){
        //初始血量
        int hp=200;
        //键盘录入伤害
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入受到的伤害值：");
        int hurt=0;
        while(true){
            hurt=sc.nextInt();
            if(hurt>-0){
                break;
            }else{
                System.out.println("输入的伤害值有误，请重新输入一个数：");
            }
        }
        hp-=hurt;
        if(hp<=0){
            hp=1;
        }
        //键盘录入恢复血量
        System.out.println("请输入恢复的血量值：");
        int add=0;
        while(true){
            add=sc.nextInt();
            if(add>0){
                break;
            }else{
                System.out.println("输入的恢复血量值有误，请重新输入一个数：");
            }
        }
        hp+=add;
        if(hp>200){
            hp=200;
        }
        System.out.println("最终的血量为："+hp);

    }
}
