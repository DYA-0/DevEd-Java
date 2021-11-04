package com.company;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        System.out.println("Введите число для поиска нечетных цифр: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int number_sout = number;
        int count_odd = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 1){
                count_odd++;
            }
            number /= 10;
        }
        System.out.println("Количество нечетных цифр в числе " + number_sout + " равно " + count_odd);
    }
}
