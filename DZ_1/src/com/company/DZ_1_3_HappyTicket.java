package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ_1_3_HappyTicket extends DZ_1_1_Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вас приветствует программа проверки счастья по билетам!");
        System.out.print("Введите 6 цифр номера билета: ");
        String ticketNum = reader.readLine();
        if (!isNumeric(ticketNum)){
            System.out.println("Номер билета введён некорректно!");
        }
        String[] tempTicketNumArr = ticketNum.split("");
        int[] ticketNumArr = new int[tempTicketNumArr.length];
        for (int i = 0; i < tempTicketNumArr.length; i++){
            ticketNumArr[i] = Integer.parseInt(tempTicketNumArr[i]);
        }
        if ((ticketNumArr[0] + ticketNumArr[1] + ticketNumArr[2]) == (ticketNumArr[ticketNumArr.length - 1] + ticketNumArr[ticketNumArr.length - 2] + ticketNumArr[ticketNumArr.length - 3])){
            System.out.println("Ваш билет счастливый!!!!!!!");
        }
        else System.out.println("Ваш билет обычный, но не стоит расстраиваться!");

    }
}
