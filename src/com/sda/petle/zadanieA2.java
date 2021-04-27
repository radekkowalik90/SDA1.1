package com.sda.petle;

import java.util.Scanner;

public class zadanieA2 {

    public static void main(String[] args) {

        //obliczanie silni
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 1;

        for (int i = 1; i <= a; i++){
            b *= i;
        }
        System.out.println(b);
    }
}
