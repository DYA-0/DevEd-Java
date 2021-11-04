package com.company;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        System.out.println("Введите целое положительное число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int start_section = 0;
        int end_section = number;
        int power = 3;
        int iteration;
        do {
            iteration = (end_section - start_section) / 2;
            if (Math.pow(iteration, power) < number){
                start_section = iteration;
            }
            else{
                end_section = iteration;
            }
        } while (Math.pow(iteration, power) != number);
        System.out.println("Число " + number + " является кубом числа " + iteration);

    }
}
