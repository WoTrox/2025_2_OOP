package oop.labor04.lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFilePrintNumbered();
    }

    static void readFilePrintNumbered() {
        try (Scanner scanner = new Scanner(new File("lab4_1.txt"))) {
            int i = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(i + " " + line);
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
