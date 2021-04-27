package com.sda.petle;

import java.util.Scanner;

public class zadanieA3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for (int i = 1; i <= a; i++){

            if(a%3 == 0 && a%5 == 0) {
                System.out.println("FizzBuzz");
            } else if (a%3 == 0) {
                System.out.println("Fizz");
            } else if (a%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(a);
            }
        }
    }
}
