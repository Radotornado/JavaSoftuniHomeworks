package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Integer number = reader.nextInt();
        String convertedNumberToGhetto = gettoConverter(number);
        System.out.println(convertedNumberToGhetto);
    }

    private static String gettoConverter(Integer number) {
        String numberAsString = number.toString();
        StringBuilder ghettoNumber = new StringBuilder();
        for (int i = 0; i < numberAsString.length() ; i++) {
            ghettoNumber.append(gettoConverter(numberAsString.charAt(i)));
        }
        return ghettoNumber.toString();
    }

    private static String gettoConverter(char digit) {
        String dig = " ";
        switch (digit) {
            case '0': dig = "Gee";
                break;
            case '1':  dig ="Bro";
                break;
            case '2': dig = "Zuz";
                break;
            case '3': dig ="Ma";
                break;
            case '4': dig ="Duh";
                break;
            case '5': dig = "Yo";
                break;
            case '6': dig = "Dis";
                break;
            case '7': dig = "Hood";
                break;
            case '8': dig ="Jam";
                break;
            case '9': dig = "Mack";
                break;
            default: System.out.println("No getto number.");
                break;
        }
        return dig;
    }
}



