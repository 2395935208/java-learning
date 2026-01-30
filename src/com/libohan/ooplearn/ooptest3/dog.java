package com.libohan.ooplearn.ooptest3;

public class dog {
    //小狗属性：姓名，年龄
    //行为：吃骨头
    private String name;
    private int age;
    //每个变量都需要set/get方法
    public void setName(String value){
        name=value;
    }
    public String getName(){
        return name;
    }
    public void setAge(int value){
        if(value>0 &&value<16){
            age=value;
        }else{
            System.out.println("年龄超出范围，请重新输入");
        }
    }
    public int getAge(){
        return age;
    }
    //行为：吃骨头
    public void eat(){
        System.out.println("小狗吃骨头");
    }
}
