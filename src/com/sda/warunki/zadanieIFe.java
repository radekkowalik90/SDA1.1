package com.sda.warunki;

import java.util.Scanner;

public class zadanieIFe {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę od 0 do 9");

        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();

        if(liczba == 0) {
            System.out.println("~");
        } else if (liczba == 1) {
            System.out.println("!");
        } else if (liczba == 2) {
            System.out.println("@");
        } else if (liczba == 3) {
            System.out.println("#");
        } else if (liczba == 4) {
            System.out.println("$");
        } else if (liczba == 5) {
            System.out.println("%");
        } else if (liczba == 6) {
            System.out.println("^");
        } else if (liczba == 7) {
            System.out.println("&");
        } else if (liczba == 8) {
            System.out.println("*");
        } else if (liczba == 9) {
            System.out.println("?");
        } else {
            System.out.println("ERROR!!!");
        }
    }
}
