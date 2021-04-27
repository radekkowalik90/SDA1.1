package com.sda.warunki;

import java.util.Scanner;

public class zadanieIFd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ((a+b>c)&&(b+c>a)&&(a+c>b)){
            System.out.println("Trójkąt");
        }else {
            System.out.println("Nie");

            //pobieramy 3 boki
            //porównojemy je ze sobą i sprawdzamy czy da sie z nich złożyc trójkąt
            //trojkąt da sie złożyc gdy suma dwuch jest wieksza od 3 boku
        }
    }

}
