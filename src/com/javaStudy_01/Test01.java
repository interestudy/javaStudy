package com.javaStudy_01;

/**
 * 目的：计算100中有多少个数字能被4整除
 */
public class Test01 {
    private int i = 0;
    private int e = 1;
    //第一种方法：采用乘法=>从零递增乘以4 看有多少个数字小于等于100
    private int GetResult1(){
        e = 4;
        while ( e <= 100 ){
            if (e == 100) break; //e=100的情况下 计算就停止 否则运算就会多一个值
            i++;
            e = 4*i;
            System.out.println(i + "=>" + e);
        }
        return i;
    }
//第二种方法：采用除法 =>从零开始递增 能被4整除则加1
    private int GetResult2(){
         while( e <=100){
             e++;
             if(e%4 == 0) {
                 i++;
                 System.out.println(i + "=>" + e );
             }

         }
        return i;
    }
    public static void main(String[] args){
        /**
         * 计算100以内有多少个数能被四整除
         */

        Test01 t1 = new Test01();
        System.out.println(t1.GetResult1());
        Test01 t2 = new Test01();
        System.out.println(t2.GetResult2());

        /**
         * 测试 前缀++ 和 后缀++ 的区别
         * n++ 显示的递增前值 ++n显示的时后值
         */
        int n = 0,
            k = 0;
        System.out.println(n++ + " " + ++k );
        System.out.println(n + " " + k );


    }
}
