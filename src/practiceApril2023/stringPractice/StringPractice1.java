package practiceApril2023.stringPractice;

import org.w3c.dom.Text;

import java.util.Scanner;

public class StringPractice1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text you want to count and reverse:");
        String Text = scanner.next();

        countWords(Text);
        reverseText(Text);
    }
    public static void countWords(String text) {
        var Words = text.split(" ",9);
        int numberOfWords = Words.length;

        String message = String.format("Your text contains %d words ", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(Words[i]);
        }
    }

    private static void reverseText(String text) {
        for (int i = text.length()-1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }


  /*  public static void reverseText() {
        for (int i = Text.length() - 1; i > 0; i--) {
            System.out.println(Text.charAt(i));
        }
    }*/
}
