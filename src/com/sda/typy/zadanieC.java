package com.sda.typy;
import java.util.Scanner;

public class zadanieC {

    public static void main(String[] args) {

        double kg;
        double m;
        double bmi;

        System.out.println("podaj wage w kg:");
        Scanner waga = new Scanner(System.in);
        kg = waga.nextDouble();
        System.out.println("podaj wzrost w m:");
        Scanner wzrost = new Scanner(System.in);
        m = wzrost.nextDouble();
        System.out.println("BMI wynosi:");
        //bmi = kg / (m*m);
        bmi = kg / (Math.pow(m,2));
        System.out.println(bmi);

    }
}