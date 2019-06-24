package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name = "Adilet";
        System.out.println("введите возраст: ");
        int age = scanner.nextInt();
        System.out.println("введите температуру: ");
        int temp = scanner.nextInt();


        if ((temp >= 30 || temp <= -20) && (age >= 20 || age <= 45)) {
            System.out.println("Адилет не выходит гулять");

        } else if ((age < 20) && (temp >= 0 || temp <= 28)) {
            System.out.println("Адилет не выходит гулять");

        } else if ((age > 45) && (temp >= -10 || temp <= 25)) {
            System.out.println("Адилет не выходит гулять");

        } else {
            System.out.println("Адилет отправляется в гости к своему другу ");
        }
    }
}


