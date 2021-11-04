package com.company;

import java.util.Scanner;

public class Task_15 {

    public static void main(String[] args) {
        System.out.println("Введите натуральное число n: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double product = 1;
        double sum = 0;
        for (int i = 1; i <= num; i++) task_15_1: {
            product *= 2 + 1 / factorial(i);
        }

        for (int i = 1; i <= num; i++) task_15_2: {
            sum += (1 + i) / factorial(i);
        }
        System.out.println("Задание 14.1: произведение ряда равно: " + product + "\n"
                + "Задание 14.2: сумма ряда равна: " + sum);
    }

    public static double factorial (double value){
        double result = 1;
        for (int i = 1; i <= value; i++){
            result *= i;
        }
        return result;
    }
}
