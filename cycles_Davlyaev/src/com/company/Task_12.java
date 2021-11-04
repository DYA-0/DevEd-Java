package com.company;

import java.util.Scanner;

public class Task_12 {

    public static void main(String[] args) {

        System.out.println("Введите два целых числа: ");
        Scanner in = new Scanner(System.in);
        int input_num_1 = in.nextInt();
        int input_num_2 = in.nextInt();
        String result = "НЕТ";
        int number_1 = input_num_1;
        while (number_1 != 0) cycle_num_1:{
            int digit_1 = number_1 % 10;
            int number_2 = input_num_2;
            while (number_2 != 0) cycle_num_2:{
                int digit_2 = number_2 % 10;
                if (digit_1 == digit_2){
                    result = "ДА";

                }
                number_2 /= 10;
            }
            number_1 /= 10;
        }
        System.out.println(result);
    }
}
