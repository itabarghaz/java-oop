package tab.interfaces;
/**
 @author TARIK ABARGHAZ

 @descrition

 Interfaces :

     The class Eagle implements both interfaces. It defines its own functionality for the three abstract methods.
     The eat() and sound() methods come from the Animal class, while fly() comes from Bird.

 **/
public class Eagle implements Animal,Bird {

    @Override
    public void eat() {
        System.out.println("Eats reptiles and amphibians.");
    }

    @Override
    public void sound() {
        System.out.println("Has a high-pitched whistling sound.");
    }

    @Override
    public void fly() {
        System.out.println("Flies up to 10,000 feet.");
    }
}
