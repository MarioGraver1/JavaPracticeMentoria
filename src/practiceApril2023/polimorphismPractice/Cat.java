package practiceApril2023.polimorphismPractice;

public class Cat extends Animal{

    @Override
    public  void makeSound(){
        System.out.println("Meow");

    }
    public void scratch(){
        System.out.println("I am a cat, I scratch things.");
    }
}
