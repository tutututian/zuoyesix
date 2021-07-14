package com.hp.beans;

public class QuJingRen {
    private String username;
    private  String age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "QuJingRen{" +
                "username='" + username + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
