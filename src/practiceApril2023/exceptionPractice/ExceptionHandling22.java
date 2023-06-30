package practiceApril2023.exceptionPractice;

import java.util.Scanner;

public class ExceptionHandling22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you Age, be honest");
        int age = scanner.nextInt();

        checkAge(age);
    }

     static void checkAge(int age) {
        if (age < 18){
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }else {
            System.out.println("Access granted - You are old enough");
        }
    }

}
