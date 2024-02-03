package com.challenge.basic;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        String userInput = userInput();
        CheckConsonant obj = new CheckConsonant(userInput);
    }
    static String userInput(){
        String inputData;
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนตัวอักษรที่ต้องการเช็ค: ");
        inputData = sc.next();
        return inputData;
    }
}
class CheckConsonant{
    String[] consonants = {"A","E","I","O","U"};
    String userInput;
    CheckConsonant(String userInput){
        this.userInput = userInput;
        for(String consonant : consonants){
            if (userInput.toUpperCase().equals(consonant)){
                System.out.println("สระ");
                return;
            }else {
                System.out.println("พยัญชนะ");
                return;
            }
        }

    }
}