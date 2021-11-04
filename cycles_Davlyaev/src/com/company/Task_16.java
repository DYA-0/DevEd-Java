package com.company;

import java.util.Scanner;

public class Task_16 {

    public static void main(String[] args) {

        System.out.println("Введите точность в виде десятичной дроби: ");
        Scanner in = new Scanner(System.in);
        double resolution = in.nextDouble();
        System.out.println("Для нахождения суммы задания 16.3 введите значение x: ");
        double x_value = in.nextDouble();
        int power = 2;
        double sum_16_1 = 1;
        double sum_16_2 = 0;
        double sum_16_3 = 1;
        double component_16_1 = 1;
        double component_16_2 = 1;
        double component_16_3 = 1;
        double i = 2;
        while (component_16_1 >= resolution) {
            component_16_1 = 1 / Math.pow(i, power);
            sum_16_1 += component_16_1;
            i++;
        }
        i = 1;
        while (component_16_2 >= resolution){
            component_16_2 = 1 / (i * (i + 2));
            sum_16_2 += component_16_2;
            i++;
        }
        i = 1;
        while (component_16_3 >= resolution){
            component_16_3 *= x_value / i;
            sum_16_3 += component_16_3;
            i++;
        }
        System.out.println("Значение суммы ряда задания 16.1 равно: " + sum_16_1 + " ||  " + Math.PI*Math.PI/6
        + "\nЗначение суммы ряда задания 16.2 равно: " + sum_16_2 + " || " + 3.0/4
        + "\nЗначение суммы ряда задания 16.3 равно: " + sum_16_3 + " || " + Math.exp(x_value));
    }
}
