package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ_2_2_Palindroms {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите слово для проверки на палиндромность");
        String inputStr = reader.readLine();
        if (isPalindrome(inputStr)){
            System.out.println("Ведённое слово является палиндромом");
        }
        else System.out.println("Введённое слово - не палиндром");
        reader.close();
    }
    public static boolean isPalindrome(String str) {
        return str.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(str.replaceAll("\\W",""))
                        .reverse().toString());
    }
}
