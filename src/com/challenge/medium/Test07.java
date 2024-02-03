package com.challenge.medium;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        int[] userInput = userInput();
        Cal calculator = new Cal(userInput);
    }

    static int[] userInput() {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[3];
        System.out.print("ความกว้าง: ");
        number[0] = sc.nextInt();
        System.out.print("ความกว้าง: ");
        number[1] = sc.nextInt();
        System.out.print("รัศมี: ");
        number[2] = sc.nextInt();
        return number;
    }
}

class Cal {
    int[] number;

    Cal(int[] number) {
        this.number = number;
        calAndDisplay(this.number);
    }

    void calAndDisplay(int[] number) {
        int area1, area2;
        area1 = number[0] + number[1];
        area2 = (int) (Math.PI *(2* number[2]));
        System.out.println("พื้นที่: " + area1);
        System.out.println("เส้นรอบรูปวงกลม: " + area2);
    }
}
