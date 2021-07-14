package com.hp.beans;

import java.util.Scanner;

/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上
 */
public class Test03 {
    public static void main(String[] args) {
        /*
         * 编写一个回文字符串，然后调用check方法检查
         * 该字符串是否为回文，然后输出检查结果。
         * 若是回文则输出:是回文
         * 否则输出:不是回文
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scanner.nextLine();
        check(str);

    }

    /**
     * 判读该方法是否是回文
     *
     * @param str 需要判断的字符串
     * @return true表示是回文，false表示不是回文
     */
    public static boolean check(String str) {
        StringBuilder sb = new StringBuilder();
        //把字符串追加到缓冲区中
        sb.append(str);

        //获取Stringbuilder的内容 把它存入Char集合中去
        char[] chars = sb.toString().toCharArray();
        //获取Stringbuilder的内容并且反转 把它存入Char集合中去
        char[] chars1 = sb.reverse().toString().toCharArray();

        boolean bl = true;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars1[i]) {
                bl = false;
                System.out.println("这不是个回文");
                break;
            }
            if (chars[i] == chars1[i]) {
                System.out.println("这是个回文");
                break;
            }
        }
        return false;

    }
}
