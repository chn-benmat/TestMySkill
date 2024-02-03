package com.challenge.medium;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        int userInput = userInput();
        Square square = new Square(userInput);
        square.Display();
    }
    static int userInput(){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนตัวเลขที่ต้องการหารากที่สอง: ");
        number = sc.nextInt();
        return number;
    }
}
class  Square{
    int number;
    Square(int number){
        this.number = number;
    }
    void Display(){
        int square = (int) Math.sqrt(number);
        System.out.printf("รากที่สองของ %d คือ %d",number,square);
    }
}
