package tab.inheritance;
/**
 @author TARIK ABARGHAZ

 @descrition

 Inheritance :

 The TestEagle class instantiates a new Eagle object and prints out all the
 information (both the inherited fields and methods and the two extra fields defined in the Eagle class).

 **/
public class TestEagle {
    public static void main(String[] args) {
        Eagle myEagle = new Eagle();

        System.out.println("Name: " + myEagle.name);
        System.out.println("Reproduction: " + myEagle.reproduction);
        System.out.println("Outer covering: " + myEagle.outerCovering);
        System.out.println("Lifespan: " + myEagle.lifespan);
        myEagle.flyUp();
        myEagle.flyDown();
    }
}
