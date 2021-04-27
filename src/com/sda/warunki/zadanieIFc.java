package com.sda.warunki;

import java.util.Scanner;

public class zadanieIFc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();

        if(liczba%3 == 0 && liczba%5 == 0) {
            System.out.println("Liczba jest podzielna przez 3 i 5");
        } else if (liczba%3 == 0) {
            System.out.println("Liczba podzielna przez 3");
        } else if (liczba%5 == 0) {
            System.out.println("Liczba podzielna przez 5");
        } else {
            System.out.println("Liczba nie spełnia kryteriów");
        }
    }
}

