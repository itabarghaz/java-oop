package tab.interfaces;
/**
 @author TARIK ABARGHAZ

 @descrition

 Interfaces :

     An interface is a 100% abstract class. It can have only static, final, and public fields and abstract methods.
     It’s frequently referred to as a blueprint of a class as well. Java interfaces allow us to implement multiple
     inheritance in our code, as a class can implement any number of interfaces. Classes can access an interface
     using the implements keyword.

     In the example, define two interfaces, Animal and Bird. Animal has two abstract methods,
     while Bird has two static fields and an abstract method

 **/
public interface Bird {
    int numberOfLegs = 2;
    String outerCovering = "feather";

    void fly();
}
