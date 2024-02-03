package com.challenge.medium;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        int userInput = userInput();
        PowerOfTwo powerOfTwo = new PowerOfTwo(userInput);
    }
    static int userInput(){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนตัวเลขยกกำลัง: ");
        number = sc.nextInt();
        return number;
    }
}
class PowerOfTwo{
    int number;
    PowerOfTwo(int number){
        this.number = number;
        Display(this.number);
    }
    static void Display(int number){
        int power = (int)Math.pow(number,2);
        System.out.println("เลขยกกำลังของ "+number+" คือ "+power);
    }
}
