package practiceApril2023.methods1;

import java.util.Scanner;

public class methodss {


    //public -access modifier (public)-any code from any class from same package can access to this method -other(provate , protected)
    //static, final, abstract and synchronized
    //return type--indicates the data type
    //name of the method-it should reflect what the method is going to do
    //after the name a parenthesis can be empty or can be the parameter list that will be called
    //Signature is the name o the method and the parameter list
    public static int calculateSum(int number1, int number2){
        int sum = number1 + number2;  //--method body
        return sum;  //--return statement
    }

    public static void main(String[] args){
        System.out.println("Enter you name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        greetUser(name);
    }
    //Method
    public static void greetUser(String name){
        System.out.println("Hi there,  " + name);
    }



}
