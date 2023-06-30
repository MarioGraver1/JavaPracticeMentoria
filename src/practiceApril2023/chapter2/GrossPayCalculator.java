package practiceApril2023.chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        //1.Get the umber of hours worked
        System.out.println("Enter the number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate");
        double rate = scanner.nextDouble();

        //3. Multiply hours and pay rate
        double grossPlay = hours * rate;

        //4. Display the  result
        System.out.println(" ");
        System.out.println("The gross Pay rate " + grossPlay);

    }

}
