package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class DZ_2_1_Bulls_and_Cows {

    public static void main(String[] args) throws IOException {
        System.out.println("Программа \"бешеный бык и бодливая корова\" приветствует тебя, смертный!");
        while (true) {
            Random random = new Random();
            Integer[] computerCombination = new Integer[4];
            for (int j = 0; j < 4; j++) {
                computerCombination[j] = random.nextInt(10);
                //System.out.print(computerCombination[j] + " ");
            }
            //System.out.println("- Такую комбинацию загадала безумная машина");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("Задумай и введи 4 цифры:");
                int[] humanCombination = new int[4];
                for (int i = 0; i < 4; i++) {
                    humanCombination[i] = Integer.parseInt(reader.readLine());
                }
                for (int k = 0; k < humanCombination.length; k++) {
                    System.out.print(humanCombination[k] + " ");
                }
                System.out.println("- Таков твой замысел");

                int cowsCounter = 0;
                int bullsCounter = 0;
                for (int m = 0; m < humanCombination.length; m++) {
                    if (humanCombination[m] == computerCombination[m]) {
                        bullsCounter++;
                    }
                    for (int n = 0; n < computerCombination.length; n++) {
                        if (n != m) {
                            if (humanCombination[m] == computerCombination[n]) {
                                cowsCounter++;
                            }
                        }
                    }
                }
                System.out.println("Быков: " + bullsCounter);
                System.out.println("Коров: " + cowsCounter);
                System.out.println(Arrays.toString(humanCombination));
                System.out.println(Arrays.toString(computerCombination));
                if (Arrays.toString(humanCombination).equals(Arrays.toString(computerCombination))){
                    System.out.println("Ты победил, смертный!");
                    break;
                }
            }

            System.out.println("Хочешь испытать судьбу ещё раз? yes/no: ");
            if (reader.readLine().equalsIgnoreCase("no")){
                System.out.println("Game over!");
                System.exit(0);
            }
        }

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
