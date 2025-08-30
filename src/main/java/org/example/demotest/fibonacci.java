package org.example.demotest;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10, 10));
    }

    public static int fibonacci(int n,int m) {
        if (n == 0) {
            return m;
        }
        else if (m == 0){
            return n;
        }
        else {
            return fibonacci(n - 1, m) + fibonacci(n, m - 1);
        }

    }
}
