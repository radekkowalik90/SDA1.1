package com.sda.typy;
import java.util.Scanner;

public class zadanieB {

    public static void main(String[] args) {

        double f;
        double c;

        System.out.println("podaj liczbe:");
        Scanner we = new Scanner(System.in);
        c = we.nextDouble();
        System.out.println("Wartosc w F:");
        f = 32 + 1.8 * c;
        System.out.println(f);

    }
}