package com.challenge.basic;

public class Test08 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 !=0){
                System.out.println(i+1);
                continue;
            }
        }
    }
}
