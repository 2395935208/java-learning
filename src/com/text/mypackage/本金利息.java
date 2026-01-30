package com.text.mypackage;

public class 本金利息 {
        /*
    本金100000，复利为1.7%，问要存几年才能到200000？
     */
public static void main(String[]args){
    double prince=100000;
    int year=0;
    while(prince<200000){
        prince=prince*(1+0.017);
        year++;
    }
    System.out.println(year);
}
}