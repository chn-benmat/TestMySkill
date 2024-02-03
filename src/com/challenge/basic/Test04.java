package com.challenge.basic;

import java.util.LinkedList;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Average obj = new Average();
    }
}

class Average {
    LinkedList<Integer> numbers = new LinkedList<Integer>();
    static int total;

    Average() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("ป้อนตัวเลขที่ " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }
        calAvg(numbers);
    }

    static void calAvg(LinkedList<Integer> numbers) {
        for (Integer number : numbers) {
            total += number;
        }
        System.out.println("ค่าเฉลี่ยของเลขทั้งหมด: " + (total / numbers.size()));
    }
}
