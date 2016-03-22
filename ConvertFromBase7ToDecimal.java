package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the a base-7 number you want to convert to decimal: ");
        Scanner scanner = new Scanner(System.in);
        String numberToConvert = scanner.next();
            Integer decimalRepresentation = Integer.valueOf(numberToConvert, 7);
            System.out.println(decimalRepresentation);
    }
}
