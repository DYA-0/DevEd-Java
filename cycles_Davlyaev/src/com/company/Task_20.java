package com.company;

import java.util.Scanner;

public class Task_20 {

    public static void main(String[] args) {

        System.out.println("Введите целое число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int control_sum = 1;
        String result = "";
        for (int i = 2; i <= number / 2; i++){
            if (number % i == 0){
                control_sum += i;
                result += " + " + i;
            }
        }
        if (control_sum == number){
            result = "Число " + number + " совершенно :) \n" + number + " = 1" + result;
        }
        else {
            result = "Увы, число не совершенно :(";
        }
        System.out.println(result);
    }
}
