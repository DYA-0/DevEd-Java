package com.company;

import java.util.Scanner;

public class Task_14 {

    public static void main(String[] args) {
        System.out.println("Введите действительное число x и натуральное n: ");
        Scanner in = new Scanner(System.in);
        double num_x = in.nextDouble();
        double num_n = in.nextDouble();
        double sum_14_1 = 0;
        double sum_14_2 = 0;
        double element_14_1 = 1;
        double element_14_2 = 1;
        for (int i = 1; i <= num_n; i++){
            element_14_1 *= 1 / (num_x + i);
            sum_14_1 += element_14_1;
        }
        for (int i = 1; i <= num_n; i++){
            element_14_2 *= Math.pow(num_x, i) / i;
            sum_14_2 += element_14_2;
        }
        System.out.println("Задание 14.1: сумма ряда равна: " + sum_14_1 + "\n"
        + "Задание 14.2: сумма ряда равна: " + sum_14_2);
    }
}
