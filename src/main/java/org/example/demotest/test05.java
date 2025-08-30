package org.example.demotest;

import java.util.Arrays;

public class test05 {
    public static void main(String[] args) {
        User user = new User("张三", 18);
        System.out.println(user.getName());
        System.out.println(user.getClass());
        System.out.println(user.getClass().getClassLoader());
        System.out.println(user.getClass().getClassLoader().getParent());
        Class<?> cls = User.class;
        System.out.println(cls.getName());
        System.out.println(cls.getSimpleName());
        System.out.println(cls.getPackage().getName());
        System.out.println(cls.getSuperclass().getName());
        System.out.println(Arrays.toString(cls.getFields()));

    }

    public static void classloader() {

    }

}
