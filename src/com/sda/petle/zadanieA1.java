package com.sda.petle;

import java.util.Scanner;

public class zadanieA1 {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę wykonan petli");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for (int i = 0; i <= a; i++){
            System.out.println("Aktualna wartość: " + i);
        }
        System.out.println("Koniec Petli");
    }
}
