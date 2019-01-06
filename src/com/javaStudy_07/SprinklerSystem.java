package com.javaStudy_07;

/**
 * 1.组合技术：将现有类的引用置于新类中即可，新类(SprinklerSystem)由现有类(WaterSource)的对象组成
 * 2.每一个非基本类型的对象都有一个toString()方法，当编译器需要一个String类型，而你传入一个对象
 *   toString()方法便会被调用
 * 3.类中域为基本类型会被初始化为0，对象引用则被初始化为null,
 */
class WaterSource{
    private String s;
    WaterSource(){
        System.out.print("WaterSource()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}

public class SprinklerSystem {
    private String valve1, valve2,valve3,valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString(){
        return
            "valve1 = " + valve1 + " " +
            "valve2 = " + valve2 + " " +
            "valve3 = " + valve3 + " " +
            "valve4 = " + valve4 + "\n " +
            "i = " + i + " " + "f = " + f + " " +
            "source = " + source;

    }

    public static void main(String[] args){
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println("hello world");
        System.out.print(sprinklerSystem);
    }
    /* output
    WaterSource()
    valve1 = null valve2 = null valve3 = null valve4 = null
    i = 0 f = 0.0 source = Constructed
    */
}
