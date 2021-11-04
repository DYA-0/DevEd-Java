package com.company;

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {

        System.out.println("Введите два целых числа, для которых ищется НОД: ");
        Scanner in = new Scanner(System.in);
        int number_a = in.nextInt();
        int number_b = in.nextInt();
        int fantom_a = number_a;
        int fantom_b = number_b;
        while (fantom_a != 0 && fantom_b != 0){
            if (fantom_a > fantom_b){
                fantom_a = fantom_a % fantom_b;
            }
            else{
                fantom_b = fantom_b % fantom_a;
            }
        }
        System.out.println("НОД чисел " + number_a + " и " + number_b + " равен: " + (fantom_a + fantom_b));
    }
}