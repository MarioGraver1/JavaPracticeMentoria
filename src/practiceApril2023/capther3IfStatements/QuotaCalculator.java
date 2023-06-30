package practiceApril2023.capther3IfStatements;

import java.util.Scanner;

/*
IF ELSE
All salespeople are expected to make at leadt 10 sales each week
For those who do, they receive a congratulatory message.
For those who don't, they are informed ofg how many sales they were short.
 */
public class QuotaCalculator {
    public static void main(String args[]) {
        //Initialize values we know
        int quota = 10;

        //Get unknown value
        System.out.println("Enter the number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - Output.
        if (sales >= quota)
            System.out.println("Congrats! You've met your quota.");

        else {
            int salesShort = quota - sales;
            System.out.println("You did not make you quota. You were " + salesShort + " sales short");
        }
    }
}


