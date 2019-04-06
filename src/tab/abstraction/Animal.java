package tab.abstraction;
/**
 @author TARIK ABARGHAZ

 @descrition

    Abstract classes :

    An abstract class is a superclass (parent class) that cannot be instantiated. You need to instantiate one of
    its child classes if you want to create a new object. Abstract classes can have both abstract and concrete methods.
    Abstract methods contain only the method signature, while concrete methods declare a method body as well.
    Abstract classes are defined with the abstract keyword.
    In the example below, you can see an abstract class called Animal with two abstract and one concrete method.

**/
abstract class Animal {
    // abstract methods
    abstract void move();
    abstract void eat();

    // concrete method
    void label(){
        System.out.println("Animal's data:");
    }
}
