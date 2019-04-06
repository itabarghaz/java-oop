package tab.interfaces;
/**
 @author TARIK ABARGHAZ

 @descrition

     In the TestEagle test class, instantiate a new Eagle object (called myEagle)
     and print out all the fields and methods to the console.

     As static fields don’t belong to a specific object but to a whole class,
     you need to access them from the Bird interface instead of the myEagle object.

 **/
public class TestEagle {
    public static void main(String[] args) {
        Eagle myEagle = new Eagle();

        myEagle.eat();
        myEagle.sound();
        myEagle.fly();

        System.out.println("Number of legs: " + Bird.numberOfLegs);
        System.out.println("Outer covering: " + Bird.outerCovering);
    }
}
