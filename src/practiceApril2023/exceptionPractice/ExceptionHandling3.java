package practiceApril2023.exceptionPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling3 {
    public static void main(String args[]) {

        //createNewFile();
        numbersExceptionHandling();
    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");

        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }

    }

}
