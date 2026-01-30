package com.text.mypackage;

import java.util.Random;
import java.util.Scanner;

public class 大乐透 {
    /*
    彩票规则：
    前区：1~35个号码，选五个（唯一）
    后区：1~12个号码，选两个（唯一）
    跨区可以重复
    中奖规则：
    一等奖：5+2
    二等奖：5+1
    三等奖：5+0/4+2
    四等奖：4+1/3+2
    五等奖：4+0/3+1/2+2
    六等奖：3+0/1+2/2+1/0+2
    思路：
    1.先生成前区和后区数字
    2.键盘录入号码模拟购买彩票
    3.对比号码，统计中奖情况
     */
public static void main(String[]args){
    //生成前区和后区数字
    int lotteryNumber[]=new int[7];
    createFrontLotteryNumber(lotteryNumber);
    createBackLotteryNumber(lotteryNumber);
    print(lotteryNumber);
    System.out.println("\n");
    //键盘录入号码模拟购买彩票
    int buyNumber[]=new int[7];
    buyLottery(buyNumber);
    print(buyNumber);
    //对比号码统计中将情况
    compareNumber(lotteryNumber,buyNumber);
}
//对比中了几个号码
    //arr1代表奖池
    //arr2代表购买的彩票
    public static int getCount(int arr1[],int arr2[],int start,int end){
    int count=0;
    for (int i = start; i <=end; i++) {
        boolean flag=contains(arr2[i],arr1,start,end);
        if(flag==true){
            count++;
        }
    }
    return count;
    }
    //判断中了几等奖
    public static void compareNumber(int arr1[],int arr2[]){
    int count1=getCount(arr1,arr2,0,4);
    int count2=getCount(arr1,arr2,5,6);
    //判断几等奖
        if(count1==5 && count2==2){
            System.out.println("恭喜中奖一等奖！");
        }else if(count1==5&&count2==1){
            System.out.println("恭喜中奖二等奖！");
        }else if(count1==5&&count2==0 || count1==4&&count2==2){
            System.out.println("恭喜中奖三等奖！");
        }else if(count1==4&&count2==1 || count1==3&&count2==2){
            System.out.println("恭喜中奖四等奖！");
        }else if(count1==4&&count2==0 || count1==3&&count2==1 || count1==2&&count2==2){
            System.out.println("恭喜中奖五等奖！");
        }else if(count1==3&&count2==0 || count1==1&&count2==2 || count1==2&&count2==1 ||count1==0&&count2==2){
            System.out.println("恭喜中奖六等奖！");
        }
}
//购买彩票
    public static void buyLottery(int arr[]){
    Scanner sc=new Scanner(System.in);
    //先买前五个
        for (int i = 0; i <=4;) {
            System.out.println("请输入第"+(i+1)+"个前区号码：");
            int number=sc.nextInt();
            //判断是否在范围内
            if(number<=0 || number>35){
                System.out.println("输入号码有误，请重新输入：");
                continue;
            }
            //判断是否重复
            boolean flag=contains(number,arr,0,4);
            if(flag==false){
                arr[i]=number;
                i++;
            }else{
                System.out.println("输入号码有误，请重新输入：");
                continue;
            }
        }
        //再买后两个
        for (int i = 0; i <=1;) {
            System.out.println("请输入第"+(i+1)+"个后区号码：");
            int number=sc.nextInt();
            //判断是否在范围内
            if(number<=0 || number>12){
                System.out.println("输入号码有误，请重新输入：");
                continue;
            }
            //判断是否重复
            boolean flag=contains(number,arr,5,6);
            if(flag==false){
                arr[i+5]=number;
                i++;
            }else{
                System.out.println("输入号码有误，请重新输入：");
                continue;
            }
        }
    }
//生成前区号码
    public static void createFrontLotteryNumber(int arr[]){
        for (int i = 0; i <=4;) {
            Random r=new Random();
            int number=r.nextInt(1,36);
            //判断是否重复
            boolean flag=contains(number,arr,0,4);
            if(flag==false){
                arr[i]=number;
                i++;
            }else{
                continue;
            }
        }
    }
    //生成后区号码
    public static void createBackLotteryNumber(int arr[]){
    for (int i = 0; i <=1;) {
        Random r=new Random();
        int number=r.nextInt(1,13);
        //判断是否重复
        boolean flag=contains(number,arr,5,6);
        if(flag==false){
            arr[i+5]=number;
            i++;
        }else{
            continue;
        }
    }
    }
    public static boolean contains(int number,int arr[],int start,int end){
        for (int i = start; i <=end; i++) {
            if(number==arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void print(int arr[]){
    System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1){
                System.out.print(arr[i]+",");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }
}
