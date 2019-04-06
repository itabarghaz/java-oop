package tab.abstraction;
/**
 @author TARIK ABARGHAZ

 @descrition

     Now, test it with the TestBird and TestFish classes. Both call the one concrete (label()) and
     the two abstract (move() and eat()) methods.

     In the console, the concrete method has been called from the Animal abstract class,
     while the two abstract methods have been called from Bird() and Fish(), respectively.
 **/
public class TestFish {
    public static void main(String[] args){
        Animal myFish = new Fish();
        myFish.label();
        myFish.move();
        myFish.eat();
    }
}
