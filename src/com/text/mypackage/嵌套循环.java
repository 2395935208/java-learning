package com.text.mypackage;

public class 嵌套循环 {
    /*
    打印6行9列的*
     */
    public static void main(String[]args){
        //先把内循环搞清楚
        //1.每行打印九个*
        //2。在循环打印六次
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
