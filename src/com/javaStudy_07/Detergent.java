package com.javaStudy_07;

/**
 * 继承
 * 1.每一个非基本类型的对象都有一个toString()方法，当编译器需要一个String类型，而你传入一个对象
 *   toString()方法便会被调用 下面的这个例子表明 当父类重写toString方法时候 子类没有重写时 调用
 *   父类的toString方法 当父类也没有重写时 直接调用子类隐藏的toString方法 返回对象的引用
 * 2.String s 表明子类可以通过访问父类的方法获取父类字符串值
 * 3.super 关键字表示父类
 */

class Cleanser{
    private String s = "Cleanser";
    public void append(String a ){ s += a; }
    public void dilute(){ append(" dilute() "); }
    public void apply(){ append(" apply() "); }
    public void scrub(){ append(" cleanser scrub() "); }
    public String toString(){ return s; }

    public static void main(String[] args){
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
public class Detergent extends Cleanser {
    //private String d = "dock";
    public void scrub(){
        append(" Detergent.scrub() ");
        super.scrub();
    }
    public void foam(){ append(" foam() "); }

    public static void main(String[] args){
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class");
        Cleanser.main(args);
    }
}
