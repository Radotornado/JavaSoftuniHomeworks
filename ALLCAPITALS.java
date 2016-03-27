package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "EN"));

        try (BufferedReader reader = new BufferedReader(new FileReader("linesCapital.txt"))) {
            String line = reader.readLine();
            List<String> lineArray = new ArrayList<>();

            while (line != null) {
                lineArray.add(line.toUpperCase());

                line = reader.readLine();
            }

            reader.close();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("linesCapital.txt"))) {
                PrintWriter printWriter = new PrintWriter("linesCapital.txt");

                for (int i = 0; i < lineArray.size(); i++) {
                    printWriter.println(lineArray.get(i));
                }

                printWriter.close();
                writer.close();

                System.out.print("Success!");
            }
        } catch (FileNotFoundException fileNotFoundEx) {
            System.out.print("Error: File not found.");
        } catch (IOException inputOutputEx) {
            System.out.print("Error: Invalid file.");
        }
    }
}
