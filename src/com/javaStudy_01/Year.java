package com.javaStudy_01;

import java.util.Scanner;

/**
 * 判断闰年
 */
public class Year {

    public static void main(String[] args){
        //Scanner  一个简单的文件扫描器 从控制台获取信息
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个年份:");

        long year;
        try {
            year = scan.nextLong();
            if (year%4 == 0 && year%100 != 0 || year%400 == 0){
                System.out.println(year + "是闰年");
            }else {
                System.out.println(year+"是平年");
            }
        }catch (Exception e){
            System.out.println("您输入的不是年份");
        }
    }
}
