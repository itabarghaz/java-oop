package tab.inheritance;
/**
 @author TARIK ABARGHAZ

 @descrition

 Inheritance :

 Inheritance allows us to extend a class with child classes that inherit the fields and methods of the parent class.
 It’s an excellent way to achieve code reusability. In Java, we need to use the extends keyword to create a child class.

 In the example, the Eagle class extends the Bird parent class. It inherits all of its fields and methods,
 plus defines two extra fields that belong only to Eagle.

 **/
public class Eagle extends Bird {
    public String name = "eagle";
    public int lifespan = 15;
}
