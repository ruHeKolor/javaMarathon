package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ_1_1_Calculator {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Калькулятор приветствует тебя, пользователь!");
        while (true){
            System.out.print("Введите первое число: ");
            String tempNum1 = reader.readLine();
            if (tempNum1.equalsIgnoreCase("stop")){
                break;
            }
            if (!isNumeric(tempNum1)) {
                System.out.print("Введено не число! ");
                continue;
            }
            int firstNum = Integer.parseInt(tempNum1);


            System.out.print("Введите второе число: ");
            String tempNum2 = reader.readLine();
            if (tempNum2.equalsIgnoreCase("stop")) {
                break;
            }
            if (!isNumeric(tempNum2)) {
                System.out.print("Введено не число! ");
                continue;
            }
            int secondNum = Integer.parseInt(tempNum2);


            System.out.print("Введите знак операции: ");
            String tempOperation = reader.readLine();
            if (tempOperation.equalsIgnoreCase("stop")){
                break;
            }
            String operationSign = tempOperation;
            int result = 0;
            if (operationSign.equals("+")){
                result = firstNum + secondNum;
                System.out.println("Результат выполнения операции: " + firstNum + "+" + secondNum + "="+ result);
            }
            else if (operationSign.equals("-")){
                result = firstNum - secondNum;
                System.out.println("Результат выполнения операции: " + firstNum + "-" + secondNum + "="+ result);
            }
            else if (operationSign.equals("*")){
                result = firstNum * secondNum;
                System.out.println("Результат выполнения операции: " + firstNum + "*" + secondNum + "="+ result);
            }
            else if (operationSign.equals("/")){
                if (secondNum != 0) {
                    double resultDivideNull = (double)firstNum / (double)secondNum;
                    System.out.println("Результат выполнения операции: " + firstNum + "/" + secondNum + "=" + resultDivideNull);
                }
                else System.out.println("Деление на ноль недопустимо!");
            }
            else System.out.println("Такой математической операции не существует!");
        }
        reader.close();
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
