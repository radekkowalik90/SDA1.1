package com.sda.warunki;

import java.util.Scanner;

public class zadanieIFb {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();

        if(liczba%2 == 0) {
            System.out.println("Liczba parzysta");
        } else {
            System.out.println("Liczba nieparzysta");
        }
    }
}
