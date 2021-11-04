package com.company;

import java.util.Scanner;

public class Task_22 {

    public static void main(String[] args) {

        System.out.println("Введите номер цифры: ");
        Scanner in = new Scanner(System.in);
        int num_letter = in.nextInt();
        int count = 0;
        int power = 2;
        int iter = 1;
        while (count < num_letter){
            int component = (int) Math.pow(iter, power);
            count += countdigits(component);
            iter++;
            System.out.print(component);
        }
        System.out.println();
        int component = (int) Math.pow(iter - 1, power);
        int letter = component / (int) Math.pow(10, count - num_letter) % 10;
        System.out.println("Цифра с порядковым номером " + num_letter + ": " + letter);
    }

    public static int countdigits (int a) {
        int result = 0;
        while (a != 0) {
            result++;
            a /= 10;
        }
        return result;
    }
}
