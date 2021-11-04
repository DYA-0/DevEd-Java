package com.company;

import java.util.Scanner;

public class Task_18 {

    public static void main(String[] args) {
        String result = "";
        for (int num = 100; num <= 999; num++) {
            int number = num;
            double sum_digit_factorial = 0;
            while (number != 0) {
                int digit = number % 10;
                double digit_factorial = factorial(digit);
                sum_digit_factorial += digit_factorial;
                number /= 10;
            }
            if (sum_digit_factorial == num){
                result += num + ", ";
            }
        }
        System.out.println("Трёхзначные числа, представимые в виде суммы факториалов их цифр: \n" +
                 result);
    }

    public static double factorial (int value) {
        double result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}

