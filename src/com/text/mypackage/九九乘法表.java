package com.text.mypackage;

public class 九九乘法表 {
    /*
    打印一个九九乘法表
     */
    public static void main(String[]args){
        //先写外循环
        for (int i = 1; i <= 9; i++) {
            //内循环
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
