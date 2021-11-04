package com.company;

import java.util.Scanner;

public class Task_13 {

    public static void main(String[] args) {
        System.out.println("Введите натуральное число N: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int power = 2;
        double sum = 0;
        for (int i = 1; i <= num; i++){
            sum += 1 + 1 / Math.pow(i, power);
        }
        System.out.println(sum);
    }
}
