package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ_1_2_Dekrementor extends DZ_1_1_Calculator{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Вас приветствует программа-декрементор до нуля!");
            System.out.print("Введите начальное число: ");
            String tempStartNumber = reader.readLine();
            if (!isNumeric(tempStartNumber)){
                System.out.println("Введено не число! ");
                break;
            }
            int startNumber = Integer.parseInt(tempStartNumber);

            System.out.print("Введите шаг декрементации: ");
            String tempReductionStep = reader.readLine();
            if (!isNumeric(tempReductionStep)){
                System.out.println("Введено не число! ");
                break;
            }
            int reductionStep = Integer.parseInt(tempReductionStep);

            if (startNumber < reductionStep){
                System.out.println("Декрементация невозможна!");
                break;
            }
            System.out.println("Результат выполнения программы:");
            for (int i = startNumber; i >= 0; i = i - reductionStep){
                System.out.print(i + ", ");
            }
            break;
        }
        reader.close();
    }
}
