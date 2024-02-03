package com.challenge.basic;

import java.util.Scanner;

public class Test02 {
    static int userInput() {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนตัว: ");
        number= sc.nextInt();
        checkNumber(number);
        return number;
    }
    static void checkNumber(int number){
        if (number % 2 == 0){
            System.out.println("เลขคู่");
        }else {
            System.out.println("เลขคี่");
        }
    }
    public static void main(String[] args) {
        userInput();
    }
}
