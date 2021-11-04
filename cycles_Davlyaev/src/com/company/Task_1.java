package com.company;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        System.out.println("Введите два числа: ");
        Scanner in = new Scanner(System.in);
        double number_a = in.nextDouble();
        double number_b = in.nextDouble();
        double control = Math.pow(number_a, number_b);
        System.out.println(control);
    }
}
