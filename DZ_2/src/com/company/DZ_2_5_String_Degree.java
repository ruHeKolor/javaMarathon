package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DZ_2_5_String_Degree {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "src/inputData_2_5.txt";
        Scanner scanner = new Scanner(new FileReader(filePath));
        String inputString = scanner.nextLine();

        if (inputString.length() < 1000) {
            String[] inputStringArr = inputString.split("");
            int degree = scanner.nextInt();
            StringBuilder outputString = new StringBuilder();
            if (inputString.length() / Math.abs(degree) == 1 && degree < 0){
                System.out.println("NO SOLUTION");
            }
            else if (degree > 0){
                System.out.println(inputString.repeat(degree));
            }
            else {
                int negativeDegree = inputString.length() / Math.abs(degree);
                for (int i = 0; i < negativeDegree; i++){
                    outputString.append(inputStringArr[i]);
                }
                System.out.println(outputString);
                outputString.setLength(0);
            }
        }
        else {
            System.out.println("Строка слишком большая");
            System.exit(0);
        }
        scanner.close();
    }
}
