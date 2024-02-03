package com.challenge.medium;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        float[] userInput = userInput();
        Divide divide = new Divide(userInput);
        divide.calAndDisplay();
    }

    static float[] userInput() {
        float[] numbers = new float[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("ป้อนตัวเลขที่ " + (i + 1) + ": ");
            numbers[i] = sc.nextFloat();
        }
        return numbers;
    }
}

class Divide {
    float[] numbers;

    Divide(float[] numbers) {
        this.numbers = numbers;
    }

    void calAndDisplay() {
        if (numbers.length < 2) {
            System.out.println("ไม่มีจำนวนเพียงพอสำหรับการหาร");
            return;
        }
        float divide = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                divide /= numbers[i];
            } else {
                System.out.println("ไม่สามารถทำการหารด้วยศูนย์ได้.");
                return;
            }

        }
        System.out.printf("ผลหาร (หารเต็ม): %.0f%n",divide);
        System.out.printf("ผลหาร (หารทศนิยม): %.2f%n",divide);
    }
}


