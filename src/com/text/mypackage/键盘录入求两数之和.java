package com.text.mypackage;//先导入键盘录入的类
import java.util.Scanner;
public class 键盘录入求两数之和 {
    public static void main(String[]args){
        //先找到scanner
        Scanner sc=new Scanner(System.in);
        //输入第一个数字
        System.out.println("请输入第一个数字：");
                int sum1=sc.nextInt();
        //输入第二个数字
        System.out.println("请输入第二个数字");
        int sum2=sc.nextInt();
        //求和
        int sum=sum1+sum2;
        System.out.println("两个数字之和为："+sum);

    }
}
