package com.sda.petle;
import java.util.Scanner;

public class zadanieA6 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę ");
        Scanner input = new Scanner(System.in);
        int suma = 0;
        int liczba = 1;

        while(liczba !=0){
            liczba = input.nextInt();
            suma+=liczba;

        }
        //suma -= 1;
        System.out.println("Suma tych liczb to: "+suma);
    }
}

