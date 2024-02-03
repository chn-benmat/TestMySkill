package com.challenge.medium;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        float userInput = userInput();
        ConTemp conTemp = new ConTemp(userInput);
        conTemp.celsius();
    }
    static float userInput(){
        float temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนอุณหภูมิที่ต้องการแปลง(F): ");
        temp = sc.nextFloat();
        return temp;
    }
}

class Temp{
    float temp;
    Temp(float temp){
        this.temp = temp;
    }

}
class  ConTemp extends Temp{

    ConTemp(float temp) {
        super(temp);
    }
    void celsius(){
        float cel;
        cel = (9.0f / 5.0f )* this.temp ;
        display(cel);
    }
    void display(float cel){
        System.out.println("อุณหภูมิในเซลเซียส: "+ cel);
    }
}

