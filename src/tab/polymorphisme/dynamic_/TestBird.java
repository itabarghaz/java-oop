package tab.polymorphisme.dynamic_;
/**
 @author TARIK ABARGHAZ

 @descrition

 Dynamic polymorphism :

 The TestBird class first instantiates a new Animal object and calls its eat() method. Then,
 it also creates a Bird object and calls the polymorphic eat() method again.
 **/
public class TestBird {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat();

        Animal myBird = new Bird();
        myBird.eat();
    }
}
