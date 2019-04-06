package tab.abstraction;
/**
 @author TARIK ABARGHAZ

 @descrition

     Extend the Animal abstract class with two child classes: Bird and Fish.
     Both of them set up their own functionality for the move() and eat() abstract methods.

 **/
public class Bird extends Animal{

    @Override
    void move() {
        System.out.println("Moves by flying.");
    }

    @Override
    void eat() {
        System.out.println("Eats birdfood.");
    }
}
