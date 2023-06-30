package practiceApril2023;

import java.util.Scanner;

public class EmployeeMain {


    public static void main(String[] args) {
       Scanner ages = new Scanner(System.in);
        double numEmployees = 0;
        double sumAges = 0;
        double ageAverage = 0;
        System.out.println("Please enter the nummber of employees");
        numEmployees = ages.nextInt();

        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("Please enter the age of the employee :" + i);
            double employeeAge = ages.nextInt();

            sumAges = sumAges + employeeAge;
        }
        ageAverage = sumAges / numEmployees;
            System.out.println("The average of the ages is: " + ageAverage);

      /*  System.out.println(Math.abs(9));
        System.out.println(114%10);*/

    }

}



