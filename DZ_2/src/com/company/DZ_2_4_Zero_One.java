package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ_2_4_Zero_One extends DZ_2_1_Bulls_and_Cows{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите последовательность, состоящую только из цифр \"0\" и \"1\": ");
        String inputStr = reader.readLine();
        char[] charArray = inputStr.toCharArray();
        for (int j = 0; j < charArray.length; j++){
            if (!isNumeric(String.valueOf(charArray[j]))){
                System.out.println("Введена некорректная последовательность!");
                System.exit(0);
            }
            else if (Integer.parseInt(String.valueOf(charArray[j])) != 0 || Integer.parseInt(String.valueOf(charArray[j])) != 1){
                System.out.println("Введена некорректная последовательность!");
                System.exit(0);
            }
        }
        int zeroCounter = 0;
        int zeroCounterMax = 0;
        for (int i = 0; i < charArray.length; i++){
            //System.out.print(charArray[i] + " ");
            if (Integer.parseInt(String.valueOf(charArray[i])) == 0){
                zeroCounter++;
                if (zeroCounter > zeroCounterMax) {
                    zeroCounterMax = zeroCounter;
                }
            }
            else zeroCounter = 0;
        }
        System.out.print(zeroCounterMax);
        reader.close();
    }
}
