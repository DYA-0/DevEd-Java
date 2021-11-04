package com.company;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        System.out.println("Введите два целых числа: ");
        Scanner in = new Scanner(System.in);
        int number_a = in.nextInt();
        int number_b = in.nextInt();
        if (number_a > number_b){
            int temp = number_b;
            number_b = number_a;
            number_a = temp;
        }
        int denominator = 7;
        int iteration = number_a;
        int sum = 0;
        while (iteration <= number_b){
            if (iteration % denominator == 0){
                sum += iteration;
                iteration ++;
            }
            else{
                iteration ++;
            }
        }
        System.out.println("Сумма чисел делящихся на " + denominator + " на интервале от "
                + number_a + " до " + number_b + " равна: " + sum);
    }
}