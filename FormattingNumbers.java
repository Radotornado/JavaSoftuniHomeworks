package com.company;

import java.nio.ByteBuffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        String hexAString = Integer.toHexString(a).toUpperCase();
        String binAString = Integer.toBinaryString(a);
        System.out.println();
        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", hexAString,
                Integer.parseInt(binAString), b, c);
    }
}
