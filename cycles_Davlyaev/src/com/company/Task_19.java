package com.company;

import java.util.Scanner;

public class Task_19 {

    public static void main(String[] args) {

        System.out.println("Введите натуральное число M: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String result = "";
        for (int i = 1; i <= Math.sqrt(number); i++){
            for (int j = 1; j <= Math.sqrt(number); j++){
                if (i * i + j * j == number) {
                    result += i + "^2 + " + j + "^2 = " + number + "\n";
                }
            }
        }
        if (result == ""){
            result = "Число " + number + " невозможно представить в виде суммы квадратов двух натуральных чисел";
        }
        System.out.println(result);
    }
}
