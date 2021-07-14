package com.hp.beans;

    public class Test01 {
        public static void main(String[] args) {
            String str = "HelloWorld";
            test1(str);
            //以下自行调用test2,test3...等方法。
            test2(str);
            test3(str);
            test4(str);
            test5(str);
            test6(str);
            test7(str);
            test8(str);
            test9(str);
        }
        /**
         * 以当前方法为例，下面继续编写test2,test3...等方法。
         * 每个方法中实现类描述中的一个需求。
         * 当前方法实现:1输出字符串"HelloWorld"的字符串长度
         *
         * test2实现:2:输出"HelloWorld"中"o"的位置
         * 以此类推。
         * @param str
         */
        public static void test1(String str){
            int a=str.length();
            System.out.println("字符串的长度为： " + a);
        }
        //2:输出"HelloWorld"中"o"的位置
        public static void test2(String str){
            int i = str.indexOf("o");  //查找出来是第一次出现的位置
            System.out.println("'o'的位置是： " + i);
        }
        //3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
        public static void test3(String str){
            int i = str.indexOf("o", 5);
            System.out.println("从下标5出开始第一次出现'o'的位置是： " + i);
        }
        //4:截取"HelloWorld"中的"Hello"并输出
        public static void test4(String str) {
        String s=str.substring(0,5);
            System.out.println("输出为：" + s);
        }
        //5:截取"HelloWorld"中的"World"并输出
        public static void test5(String str) {
            String s=str.substring(5,10);
            System.out.println("输出为：" + s);
        }
        //6:将字符串"  Hello   "中两边的空白去除后输出
        public static void test6(String str) {
            String s2=" Hello ";
            String tt = s2.trim();
            System.out.println("输出为：" + tt);
        }
        //7:输出"HelloWorld"中第6个字符"W"
        public static void test7(String str) {
            char c=str.charAt(5);
            System.out.println("第6个字符是：" + c);
        }
        //8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
        public static void test8(String str) {
            boolean h = str.startsWith("h");
            System.out.println("h = " + h);
            boolean ld = str.endsWith("ld");
            System.out.println("ld = " + ld);
        }
        //9:将"HelloWorld"分别转换为全大写和全小写并输出。
        public static void test9(String str) {
            String s = str.toUpperCase();
            System.out.println("全大写：" + s);
            String s1 = str.toLowerCase();
            System.out.println("全小写：" + s1);
        }

        }


