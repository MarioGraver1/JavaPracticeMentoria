package practiceApril2023.methods1;

import java.awt.*;

public class chapter6aRectangle {
    //Encapsulation with private --which means that no other class outside this one can access to this fields.
    //encapsulation says to make your fields private and make your methods that are used to access those fields public
    private double length;
    private double width;

    //construtor to pass the values to fields length and width
    public chapter6aRectangle() {
        length = 0;
        width = 0;
    }

    //contructor to asign values to fields length and width from setters
    public chapter6aRectangle(double length, double width) {
        this.length = length; //can be set this way
        setWidth(width); //or can be set this way, there are only different here to demo alternative options
    }


    //getters and setters**
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    //getters and setters**

    //method to calculate Perimeter
    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    //method to calculate are
    public double calculateArea() {
        return length * width;
    }


}
