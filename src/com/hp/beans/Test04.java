package com.hp.beans;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 */
public class Test04 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("请输入你的email地址：");
         String s = scanner.nextLine();

         Em(s);
    }
    public static void Em(String s){
        //找到“@” 所在的位置
        int a=s.indexOf("@");
        //从头开始截取到“@”结束
        String substring = s.substring(0,a);
        System.out.println("该mail的用户名是：" + substring);

    }
}
