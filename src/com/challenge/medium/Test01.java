package com.challenge.medium;

import java.util.LinkedList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        LinkedList<Integer> userInput = userInput();
        Calculater cal = new Calculater(userInput);
    }

    static LinkedList<Integer> userInput() {
        LinkedList<Integer> numbers = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("ป้อนตัวเลขที่ " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }
        return numbers;
    }
}

class Calculater {
    LinkedList<Integer> numbers;

    Calculater(LinkedList<Integer> numbers) {
        this.numbers = numbers;
        calAndDisplay();
    }

    void calAndDisplay() {
        int add = 0,minus = 0,multiply = 1;
        for (Integer number : this.numbers) {
            add += number;
            minus = number - minus ;
            multiply *= number;
        }
        System.out.println("ค่าบวก: "+add);
        System.out.println("ค่าลบ: "+minus);
        System.out.println("ค่าคูณ: "+multiply);
    }
}