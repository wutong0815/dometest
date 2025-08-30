package org.example.demotest;

public class test03 {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("org.example.demotest.test02");
            System.out.println(aClass.getClassLoader());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
