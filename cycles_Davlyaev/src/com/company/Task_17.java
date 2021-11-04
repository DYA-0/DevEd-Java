package com.company;

import java.util.Scanner;
public class Task_17 {

    public static void main(String[] args) {

        System.out.println("Для нахождения двузначных чисел, сумма цифр которых не изменяется " +
                "при умножении на число из отрезка [2, 9], " +
                "\nвведите цифру от 2 до 9 включительно: ");
        Scanner in = new Scanner(System.in);
        int multiplier = in.nextInt();
        String result = "";
        for (int num = 10; num <= 99; num++) {
            int number = num;
            int number_multi = number * multiplier;
            int sum_digit_number = 0;
            int sum_digit_number_multi = 0;
            while (number != 0) {
                int digit_number = number % 10;
                sum_digit_number += digit_number;
                number /= 10;
            }
            while (number_multi != 0) {
                int digit_number_multi = number_multi % 10;
                sum_digit_number_multi += digit_number_multi;
                number_multi /= 10;
            }
            if (sum_digit_number == sum_digit_number_multi){
                result += num + ", ";
            }
        }
        System.out.println("Числа, сумма цифр которых не изменяется при умножении их на " + multiplier
        + ": \n" + result);
    }
}
