package com.challenge.medium;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        int[] userInput = userInput();
        Calculator calculator = new Calculator(userInput);
    }

    static int[] userInput() {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[2];
        System.out.print("ความกว้าง: ");
        number[0] = sc.nextInt();
        System.out.print("ความกว้าง: ");
        number[1] = sc.nextInt();
        return number;
    }
}

class Calculator {
    int[] number;

    Calculator(int[] number) {
        this.number = number;
        calAndDisplay(this.number);
    }

    void calAndDisplay(int[] number) {
        int area1, area2;
        area1 = number[0] + number[1];
        area2 = 2 * (number[0] + number[1]);
        System.out.println("พื้นที่: " + area1);
        System.out.println("เส้นรอบรูป: " + area2);
    }
}
