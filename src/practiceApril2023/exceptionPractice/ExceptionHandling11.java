package practiceApril2023.exceptionPractice;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling11 {
    public static void main(String[] args) {

        myNumber10Error();
    }

    public static void myNumber10Error() {
        try {
            int[] myNumber = {1, 2, 3};
            System.out.println(myNumber[10]);
        }catch (Exception e){
            System.out.println("Something went wrong");
        }finally {
            System.out.println("The 'try catch' is finished.");
        }


    }

}
