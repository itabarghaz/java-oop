package tab.polymorphisme.static_;
/**
 @author TARIK ABARGHAZ

 @descrition

 Static polymorphism :

     The test class instantiates a new Bird object and calls the fly() method three times. Firstly,
     without parameters, secondly, with one integer parameter for height, and thirdly,
     with two parameters for name and height.

 **/
public class TestBird {
    public static void main(String[] args) {
        Bird myBird = new Bird();

        myBird.fly();
        myBird.fly(10000);
        myBird.fly("eagle", 10000);
    }
}
