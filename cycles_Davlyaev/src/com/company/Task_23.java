package com.company;

import java.util.Scanner;

public class Task_23 {

    public static void main(String[] args) {

        System.out.println("Введите номер цифры: ");
        Scanner in = new Scanner(System.in);
        int num_letter = in.nextInt();
        int count = 0;
        int pre_component = 1;
        int component = 0;
        while (count < num_letter) {
            component = component + pre_component;
            pre_component = component - pre_component;
            count += countdigits(component);
            System.out.print(component);
        }
        System.out.println();
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
