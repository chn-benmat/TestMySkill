package com.challenge.medium;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        float userInput = userInput();
        ConvertTemp convertTemp = new ConvertTemp(userInput);
        convertTemp.fahrenheit();
    }
    static float userInput(){
        float temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนอุณหภูมิที่ต้องการแปลง(C): ");
        temp = sc.nextFloat();
        return temp;
    }
}

class Tempology{
    float temp;
    Tempology(float temp){
        this.temp = temp;
    }

}
class  ConvertTemp extends Tempology{

    ConvertTemp(float temp) {
        super(temp);
    }
    void fahrenheit(){
        float fah;
        fah = (9.0f / 5.0f )* this.temp + 32;
        display(fah);
    }
    void display(float fah){
        System.out.println("อุณหภูมิในฟาเรนไฮต์: "+ fah);
    }
}

