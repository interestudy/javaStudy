package com.javaStudy_07;

/**
 * 目的：测试惰性初始化
 *
 * 1.惰性初始化 需要使用Fist对象的时候 才会进行初始化 否则 不初始化
 * 2.静态上下文 不能引用非静态变量
 * 3.初始化的顺序是 成员变量 然后构造器
 */
class First{
    private String f;
    First(){
        System.out.println("First() 构造器初始化");
        f = "First number";
    }
    public String toString(){
        return f;
    }
}
public class Second {
    private String s;
    private First first;
    Second(){
        System.out.println("Second() 构造器初始化");
        s = "second number";
    }
    //判断first是否初始化
    public void checkFirst(){
        if(first == null){
            System.out.println("引用对象first未被初始化");
        }else{
            System.out.println("引用对象first已被初始化");
        }
    }
    public First getFirst(){
        first = new First();
        return first;
    }
    public String toString(){
        return s;
    }

    public static void main(String[] args){
        Second second = new Second();
        second.checkFirst();
        //first = new First();
        First first = second.getFirst();
        second.checkFirst();
        System.out.println(second);
        System.out.println(first);
    }

}
