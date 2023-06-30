package practiceApril2023.capther3IfStatements;

import java.util.Scanner;

import static practiceApril2023.methods1.variablesScope.notifyUser;

/*
Write an 'instan credit check' program that apporves
anuone who makes more than $25000 and has a credit score
of 700 or better, reject all others.
*/

public class VariableScopeInstCrediCheck {

    //Initialize what we know
    static int requiredSalary = 1000;
    static int requiredCreditScore = 700;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        //Get values for the unknown
        double s = getSalary();
        int c = getCreditScore();
        scanner.close();
        //Check if the user is qualified
        boolean qualified = isUserQualified(c,s);
        //Notify the user
        notifyUser(qualified);

    }

    public static double getSalary() {
        System.out.println("Enter you salary: ");

        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("Enter you credit score: ");
        int creditScored = scanner.nextInt();
        return creditScored;
    }
    public static boolean isUserQualified(int creditStore, double salary) {
        if (creditStore >= requiredCreditScore && salary >= requiredSalary) {
            return true;
        }else {
            return false;
        }
    }
}


