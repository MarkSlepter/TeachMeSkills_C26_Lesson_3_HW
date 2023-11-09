package com.teachmeskills.lesson3;

import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Outside temperature: ");
        int temperature = scanner.nextInt();
        if(temperature > -5){
            System.out.println("Warm");
        }
        if(temperature <-20){
            System.out.println("Cold");
        }
        else if (temperature > -20 && temperature < -5){
            System.out.println("Normal");
        }
    }

}
