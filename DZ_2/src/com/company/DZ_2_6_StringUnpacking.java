package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DZ_2_6_StringUnpacking extends DZ_2_1_Bulls_and_Cows{
    public static void main(String[] args) throws IOException {
        String filePath = "src/inputData_2_6.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String inputStringCombination = reader.readLine();
        String[] inputArr = inputStringCombination.split("");
        StringBuilder digitalString = new StringBuilder();
        for (int i = 0; i < inputArr.length; i++){
            if (isNumeric(inputArr[i])){
                digitalString.append(inputArr[i]);
            }
            else if (!isNumeric(inputArr[i]) && digitalString.length() > 0){
                /*for (int j = 0; j < Integer.parseInt(digitalString.toString()); j++){
                    System.out.print(inputArr[i]);
                }*/
                System.out.print(inputArr[i].repeat(Integer.parseInt(digitalString.toString())));
                digitalString.setLength(0);
                continue;
            }
            else {
                System.out.print(inputArr[i]);
            }
        }
        reader.close();
    }
}
