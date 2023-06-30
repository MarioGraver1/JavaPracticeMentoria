package practiceApril2023.capther3IfStatements;

import java.util.Scanner;

/*
NESTED IFS:
To quality for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years.
 */
public class nestedIfStatements {

    public static void main(String[] args) {
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployeed = 2;

        //Get what we don't know
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with you current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        //Make a decision
        if (salary >= requiredSalary){
            if (years >= requiredYearsEmployeed){
                System.out.println("Congrats! You qualify for the Loan");
            }
            else{
                System.out.println("Sorry, you must have worked at your current job "
                + requiredYearsEmployeed + " years.");
            }
        }
        else{
            System.out.println("Sorry, you must earn at least $ "
                    + requiredSalary + " to qualify for the loan");
        }
    }

}
