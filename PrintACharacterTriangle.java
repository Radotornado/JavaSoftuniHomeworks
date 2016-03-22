package com.company;
import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String s = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<l;i++)
        {
            for(int j=0;j<i;j++) {
                System.out.printf("%c ", s.charAt(j));
            }
            System.out.printf("%c\n",s.charAt(i));
        }
        for(int i=l-2; i>=0;i--)
        {
            for(int j=0;j<i;j++) {
                System.out.printf("%c ", s.charAt(j));
            }
            System.out.printf("%c\n", s.charAt(i));
        }
    }
}
