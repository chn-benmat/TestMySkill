package com.challenge.basic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Test01 {
    static void userInput(){
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนตัวเลขที่ 1: ");
        numbers.add(sc.nextInt());
        System.out.print("ป้อนตัวเลขที่ 2: ");
        numbers.add(sc.nextInt());
        checkNumber(numbers);
    }
    static void checkNumber(LinkedList<Integer> number){
        if(number.get(0)> number.get(1) ){
            System.out.println("ตัวเลขแรกมากกว่าตัวเลขสอง");
        } else if (number.get(0) < number.get(1) ) {
            System.out.println("ตัวเลขสองมากกว่าตัวเลขแรก");
        }else{
            System.out.println("ตัวเลขทั้งสองเท่ากัน");
        }
    }
    public static void main(String[] args) {
    userInput();
    }
}
