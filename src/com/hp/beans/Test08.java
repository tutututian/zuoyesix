package com.hp.beans;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 练习:  { "username":"tangseng", "age":"500"  }  提取json 中的  k 和  v .. 赋值到一个对象
// QuJingRen 类-----> username ,  age
public class Test08 {

    public static void main(String[] args) {
        String line = "{ \"username\":\"tangseng\", \"age\":\"500\"  } ";

        //创建QuJingRen对象
        QuJingRen q=new QuJingRen();
       String username= q.getUsername();
       String age=q.getAge();
        System.out.println(getJsonValue(username="appId",age="500"));
    }


    public static String getJsonValue(String key, String jsonString) {
        //使用非贪婪模式
        StringBuffer regex = new StringBuffer();
        regex.append("\"");
        regex.append(key);
        regex.append("\":\"(.*?)\\\"");
        Matcher matcher = Pattern.compile(regex.toString()).matcher(jsonString);
        String ret = null;
        while (matcher.find()) {
            ret = matcher.group(1);
            if (ret != null) {
                break;
            }
        }
        return ret;
    }




}
