package org.example;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {
    public static void main(String[] args) {
    }

    static int countLinesInDirectory(File directory) {
        int totalLines = 0;
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    totalLines += countLinesInDirectory(file);
                } else if (file.isFile() && file.getName().endsWith(".java")) {
                    totalLines += countLinesInFile(file);
                }
            }
        }
        return totalLines;
    }

    static int countLinesInFile(File file) {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.readLine() != null) {
                lines++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}