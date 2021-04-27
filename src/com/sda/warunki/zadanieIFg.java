package com.sda.warunki;

import java.util.Scanner;

public class zadanieIFg {

    public static void main(String[] args) {

        System.out.println("Podaj pierwszą liczbę:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        double b = input.nextDouble();
        System.out.println("Podaj znak działania:");
        String znak;
        znak = input.next();


        switch (znak) {
            case "+": {
                double dod = (a+b);
                System.out.println(dod);
                break;
            }
            case "-": {
                double odej = (a-b);
                System.out.println(odej);
                break;
            }
            case "*": {
                double mnoz = (a*b);
                System.out.println(mnoz);
                break;
            }
            case "/": {
                double dziel = (a/b);
                System.out.println(dziel);
                break;
            }
            case "power": {
                System.out.println(Math.pow(a,b));
                break;
            }
            case "root": {
                System.out.println(Math.sqrt(a));
                break;
            }
            case "pier": {
                System.out.println(Math.pow(a,1/b));
                break;
            }
            default : {
                System.out.println("ERROR");
                break;
            }
        }
    }
}
