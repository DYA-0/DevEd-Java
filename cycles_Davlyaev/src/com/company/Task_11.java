package com.company;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        System.out.println("Введите целое положительное число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String result_out = "";
        for (int iteartion = 1; iteartion <= number; iteartion++) {
            int current_num = iteartion;
            int sum_odd = 0;
            int sum_even = 0;
            while (current_num != 0) {
                int digit = current_num % 10;
                if (digit % 2 == 1) {
                    sum_odd += digit;
                } else {
                    sum_even += digit;
                }
                current_num /= 10;
            }
            if (sum_even > sum_odd) {
                result_out += iteartion + ", ";
            }
        }
        System.out.println("Числа, в которых сумма четных цифр больше  суммы нечетных: "
                + "\n" + result_out);
    }
}
