package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DZ_2_7_Repeater {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текстовую строку:");
        String inputString = reader.readLine();
        String[] inStrArray = inputString.split(" ");
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < inStrArray.length; i++){
            count = 0;
            for (int j = 0; j < inStrArray.length; j++){
                if (inStrArray[j].equalsIgnoreCase(inStrArray[i])){
                    count++;
                }
            }
            map.put(inStrArray[i], count);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Слово: " + entry.getKey() + " встречается" + " " + entry.getValue().toString() + " раз");
        }
    }
}
