package com.sda.petle;

import java.util.Scanner;

public class zadanieA8 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę ");
        Scanner input = new Scanner(System.in);
        int suma = 0;
        int liczba = 1;

        do{
            liczba = input.nextInt();
            suma+=liczba;

        }while(liczba !=0);
        System.out.println("Suma tych liczb to: "+suma);
    }
}

