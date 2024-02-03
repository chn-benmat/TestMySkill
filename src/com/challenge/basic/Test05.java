package com.challenge.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        LinkedList<Integer> userInput = userInput();
        MaxMinNumber obj = new MaxMinNumber(userInput);
    }

    static LinkedList<Integer> userInput() {
        Scanner sc = new Scanner(System.in);
        int i;
        LinkedList<Integer> numbers = new LinkedList<>();
        for (i = 0; i < 5; i++) {
            System.out.print("ป้อนตัวเลขที่ " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }
        return numbers;
    }
}

class MaxMinNumber {
    LinkedList<Integer> numbers;
    MaxMinNumber(LinkedList<Integer> numbers) {
        this.numbers = numbers;
        Integer max = Collections.max(numbers);
        Integer min = Collections.min(numbers);
        System.out.println("เลขที่มากที่สุด: " + max);
        System.out.println("เลขที่น้อยที่สุด: " + min);
    }
}



