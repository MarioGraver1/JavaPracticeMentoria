package practiceApril2023.inheritancePractice;

import practiceApril2023.overrideAndOverloadMethods.Rectangle;
import practiceApril2023.overrideAndOverloadMethods.Square;

public class InheritanceTester {
    public static void main(String[] args) {

        Mother mom = new Mother();
        mom.setName("Glenda");
        System.out.println(mom.getName() + " is a " + mom.getGender());
       // Employee employee = new Employee();

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square");

        testSquareOverridfe();


    }

    private static void testSquareOverridfe(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());
    }
}
