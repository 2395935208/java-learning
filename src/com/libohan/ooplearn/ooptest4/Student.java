package com.libohan.ooplearn.ooptest4;

public class Student {
    //属性：姓名，年龄，身高，体重
    //行为：学习
    private String name;
    private int age;
    private double height;
    private double weight;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
       this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
       this . height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return weight;
    }
    //行为
    public void study(){
        System.out.println("学习");
    }
}
