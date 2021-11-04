package com.company;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        System.out.println("Введите целое число не равное 0: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String result = "";
        if (number == 0){
            result += "Введенное число равно 0";
        }
        else {
            for (int i = 1; i <= 1000; i++) {
                if (i % number == 0) {
                    result += i + "\n";
                }
            }
        }
        System.out.println(result);
    }
}
