package com.company;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        System.out.println("Введите число для отзеркаливания: ");
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        long digits = count_digits(number);
        long result = 0;
        int i = 1;
        while (number != 0) {
            result  += number % 10 * Math.pow(10, digits - i);
            i++;
            number /= 10;
        }
        System.out.println(result);
    }

    public static long count_digits (long number) {
        int result = 0;
        while (number != 0){
            result++;
            number /= 10;
        }
        return result;
    }
}