package com.company;

import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {

        System.out.println("Введите номер числа в ряде Фибоначчи: ");
        Scanner in = new Scanner(System.in);
        int num_N = in.nextInt();
        int iterat = 1;
        long number_1 = 0;
        long number_2 = 1;
        String out = "";
        if (num_N < 1){
            out += "Номер числа не может быть меньше 1";
        }
        else {
            while (iterat < num_N) {
                number_2 = number_2 + number_1;
                number_1 = number_2 - number_1;
                iterat++;
            }
            out += "Число Фибоначчи с порядковым номером " + num_N + " равно: " + number_2;
        }
        System.out.println(out);
    }
}