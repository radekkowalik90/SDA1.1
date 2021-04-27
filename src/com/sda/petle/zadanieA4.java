package com.sda.petle;

import java.util.Scanner;

public class zadanieA4 {

    public static void main(String[] args) {

        String suma = "";

        for (int i = 0; i <= 5; i++){
            Scanner input = new Scanner(System.in);
            String prod = input.next();
            System.out.println("Dodano produkt " + prod);
            suma += prod;
        }
        System.out.println(suma);
    }
}
