package com.sda.warunki;
import java.util.Scanner;

public class zadanieDzielenie {

    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        number = input.nextInt();
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 5 i 3");
        } else if (number % 3 == 0){
            System.out.println("Liczba jest podzielna przez 3");
        }else if (number % 5 == 0){
            System.out.println("Liczba jest podzielna przez 5");
        }
        else {
            System.out.println("Liczba nie jest podzielna ani przez 3 ani przez 5");
        }
    }
}