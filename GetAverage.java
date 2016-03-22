package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        reader.useLocale(Locale.ENGLISH);
        Double firstNumber = reader.nextDouble();
        Double secondNumber = reader.nextDouble();
        Double threeNumber = reader.nextDouble();
        Double average = fAve(firstNumber, secondNumber, threeNumber);
        System.out.format("Average number is %.2f \n", average);
    }

    private static Double fAve(Double firstNumber, Double secondNumber, Double threeNumber) {
        Double sum =  firstNumber + secondNumber + threeNumber;
        Double average = sum / 3;
        return  average;
    }
}