package practiceApril2023.exceptionPractice;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalArgumentExceptin {
    public static void main(String args[]) {


        calculateSalary(48,2);

    }

    public static void calculateSalary(double hours, double rate) {
        if (hours>40){
            throw new IllegalArgumentException("We do not allow overtime.");
        }
    }


}
