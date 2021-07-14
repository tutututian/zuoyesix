package com.hp.beans;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 */
public class Test05 {
    public String code;
    public static void main(String[] args) {
        //调用验证码方法
        createCode();
    }

    public static String createCode(){
        String code = "";
        Random random = new Random();
        for(int i=0;i<5;i++){
            code+=random.nextInt(2)==0?(char)('A'+random.nextInt(26)):(char)('a'+random.nextInt(26));
        }
        System.out.println("生成的验证码是：" + code);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入验证码：");
        String s = scanner.nextLine();

        if (s.equalsIgnoreCase(code)) {
            System.out.println("验证码正确！欢迎回来！");
        }else{
            System.out.println("验证码不正确，请重新来过");
        }
        return code;
    }
}
