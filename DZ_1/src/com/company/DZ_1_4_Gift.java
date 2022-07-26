package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ_1_4_Gift extends DZ_1_1_Calculator{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вас приветствует программа составления подарков!");
        System.out.print("Введите через пробел желаемый вес подарка, вес апельсина, вес яблока, вес груши: ");
        String tempWeightMix = reader.readLine();
        String[] tempWeightMixArr = tempWeightMix.split(" ");
        int inputGiftWeight;
        int orangeWeight;
        int appleWeight;
        int pearWeight;
        if (isNumeric(tempWeightMixArr[0])){
            inputGiftWeight = Integer.parseInt(tempWeightMixArr[0]);
        }
        else inputGiftWeight = 0;
        if (isNumeric(tempWeightMixArr[1])) {
            orangeWeight = Integer.parseInt(tempWeightMixArr[1]);
        }
        else orangeWeight = 0;
        if (isNumeric(tempWeightMixArr[2])) {
            appleWeight = Integer.parseInt(tempWeightMixArr[2]);
        }
        else appleWeight = 0;
        if (isNumeric(tempWeightMixArr[3])) {
            pearWeight = Integer.parseInt(tempWeightMixArr[3]);
        }
        else pearWeight = 0;

        int giftCounter = 0;
        int orangeCounter = 0;
        int appleCounter = 0;
        int pearCounter = 0;

        while(orangeCounter * orangeWeight <= inputGiftWeight) {
            while(appleCounter * appleWeight <= inputGiftWeight) {
                while(pearCounter * pearWeight <= inputGiftWeight) {
                    if (inputGiftWeight == orangeCounter * orangeWeight + appleCounter * appleWeight + pearCounter * pearWeight) {
                        giftCounter++;
                    }
                    pearCounter++;
                }
                pearCounter = 0;
                appleCounter++;
            }
            pearCounter = 0;
            appleCounter = 0;
            orangeCounter++;
        }
        System.out.println(giftCounter);

    }
}
