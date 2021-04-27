package com.sda.typy;

import java.util.Scanner;

public class zadanieD2 {

    public static void main(String[] args) {
        //dane
        double dystans;
        int h;
        int m;
        int s;

        Scanner input = new Scanner(System.in);

        //zczytywanie

        System.out.println("Podaj dystans w metrach:");
        dystans = input.nextInt();

        System.out.println("Podaj czas w godzinach:");
        h = input.nextInt();

        System.out.println("Podaj czas w minutach:");
        m = input.nextInt();

        System.out.println("Podaj czas w sekundach:");
        s = input.nextInt();

        //obliczenia

        int suma_sekund = h * 3600 + m * 60 + s;

        int suma_h = h + m / 60 + s / 3600;

        double ms = dystans / suma_sekund;

        double mh = dystans / suma_h;

        double mm = dystans / 1609;

        double mmh = mm / suma_h;

        //output
        System.out.println("Predkosc w metrach na sekunde");
        System.out.println(ms);
        System.out.println("Predkosc w metrach na godzine");
        System.out.println(mh);
        System.out.println( "w trakcie godziny przebiegnięto mil : " + mmh);
    }
}
