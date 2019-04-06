package tab.polymorphisme.dynamic_;
/**
 @author TARIK ABARGHAZ

 @descrition

 Polymorphism :

 Polymorphism makes it possible to use the same entity in different forms. In Java,
 this means that you can declare several methods with the same name until they are different
 in certain characteristics. Java provides us with two ways to implement polymorphism: method
 overloading and method overriding.

 Dynamic polymorphism :

 By using the method overriding feature of Java, you can override the methods of a parent class from its child class.

 The Bird class extends the Animal class in the example below. Both have an eat() method. By default,
 Bird inherits its parent’s eat() method. However, as it also defines its own eat() method,
 Java will override the original method and call eat() from the child class.
 **/
public class Bird extends Animal  {
    public void eat() {
        System.out.println("This bird eats seeds.");
    }
}
