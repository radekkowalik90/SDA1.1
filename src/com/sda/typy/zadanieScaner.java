package com.sda.typy;
import java.util.Scanner;

public class zadanieScaner {

    public static void main(String[] args) {

        double cm;
        double inch;

        Scanner we = new Scanner(System.in);
        cm = we.nextDouble();
        inch = cm/2.54;
        System.out.println(inch);

    }
}
