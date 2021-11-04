package com.company;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {
        System.out.println("Введите целое делимое: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int denominator = 1;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                denominator = i;
            }
        }
        System.out.println("Наибольший делитель числа " + number + " равен " + denominator);
    }
}
