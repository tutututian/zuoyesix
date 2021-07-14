package com.hp.beans;

public class Test02 {
    public static void main(String[] args) {
        String s="大家好!";
        System.out.println("s = " + s);
        String r1 = s.replace("大家好!", "大家好!我是程序员!");
        System.out.println("a输出：" + r1);

       String b= r1.replaceAll("我是程序员!","我是优秀的程序员!");
        System.out.println("b输出：" + b);

        String c=b.replaceAll("我是优秀的程序员!","我是牛牛的程序员!");
        System.out.println("c输出：" + c);

        String d=c.replaceAll("大家好!我是牛牛的程序员!","我是牛牛的程序员!");
        System.out.println("d输出：" + d);
    }
}
