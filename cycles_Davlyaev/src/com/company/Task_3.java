package com.company;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        System.out.println("Введите целое положительное число: ");
        Scanner in = new Scanner(System.in);
        int number_a = in.nextInt();
        int number_count = 0;
        int i = 1;
        while (i*i < number_a){
            number_count++;
            i++;
        }
        System.out.println(number_count);
    }
}
