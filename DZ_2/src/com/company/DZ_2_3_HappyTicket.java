package com.company;

import java.io.IOException;
import java.util.Scanner;

public class DZ_2_3_HappyTicket extends DZ_2_1_Bulls_and_Cows {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String ticket_str;
        int ticket;
        int temp_sum1 = 0;
        int temp_sum2 = 0;
        boolean err = false;

        System.out.println("Введите номер билета");
        ticket_str = sc.next();
        if (isNumeric(ticket_str)) {
            ticket = Integer.parseInt(ticket_str);
        } else {
            System.out.println("Введено некорректное значение");
            err = true;
        }

        if (!err) {
            String[] ticketNumbersStringArray = ticket_str.split("");
            int[] ticketNumbersIntArray = new int[ticketNumbersStringArray.length];
            for (int i = 0; i < ticketNumbersStringArray.length; i++){
                ticketNumbersIntArray[i] = Integer.parseInt(ticketNumbersStringArray[i]);
            }

            int halfOfNumbers = ticketNumbersIntArray.length / 2;
            for (int j = 0; j < ticketNumbersIntArray.length; j++){
                if (j < halfOfNumbers) temp_sum1 = temp_sum1 + ticketNumbersIntArray[j];
                else if (j >= halfOfNumbers) temp_sum2 = temp_sum2 + ticketNumbersIntArray[j];
            }

            if (temp_sum1 == temp_sum2){
                System.out.println("Ваш билет счастливый!");
            } else System.out.println("Ваш билет не является счастливым");

        } else {
            System.out.println("Выполнение программы невозможно!");
        }

    }
}
