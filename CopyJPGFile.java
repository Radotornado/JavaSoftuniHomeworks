package com.company;
import java.io.*;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "EN"));
        File oldCat = new File("scheme.jpg");
        File newCat = new File("my-copied-scheme.jpg");

        try {
            FileInputStream reader = new FileInputStream(oldCat);
            FileOutputStream writer = new FileOutputStream(newCat);

            try {
                int currentByte = reader.read();

                while (currentByte != -1) {
                    writer.write(currentByte);
                    currentByte = reader.read();
                }
            } catch (FileNotFoundException fileNotFoundEx) {
                System.out.print("Error: File not found!");
            } catch (IOException inputOutputEx) {
                System.out.print("Error: Invalid file!");
            }

            reader.close();
            writer.close();
        } catch (IOException inputOutputEx) {
            System.out.print("Error: Invalid file!");
        }
    }
}
