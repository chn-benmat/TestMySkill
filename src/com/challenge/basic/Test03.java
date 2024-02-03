package com.challenge.basic;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
    Multiplication obj = new Multiplication();
    }
}

class Multiplication{
     int number;
    Multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนแม่สูตรคูณที่ต้องการ: ");
        number = sc.nextInt();
        display(number);
    }
    void display(int number){
        for(int i =0; i<=12;i++){
            System.out.println(String.format("%d X %d = %d",number,i,number*i));
        }
    }
}
