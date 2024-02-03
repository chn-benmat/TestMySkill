package com.challenge.medium;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        int userInput = userInput();
        Factorail factorail = new Factorail(userInput);
        factorail.display(factorail.calculator());
    }

    static int userInput() {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนตัวเลขที่ต้องการทำแฟกทอเรียล: ");
        number = sc.nextInt();
        return number;
    }
}

class Factorail {
    int number;

    Factorail(int number) {
        this.number = number;
    }

    int calculator() {
        int total = 1;
        for (int i = 1; i<= this.number; i++) {
            total *= i;
        }
        return total;
    }

    void display(int total) {
        System.out.println("เเฟกทอเรียลของ " + this.number + " คือ "+ total);
    }
}