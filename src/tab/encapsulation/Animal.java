package tab.encapsulation;
/**
 @author TARIK ABARGHAZ

 @descrition

 Encapsulation :

 With encapsulation, you can protect the fields of a class. To do so,
 declare the fields as private and providing access to them with getter and setter methods.

 The Animal class below is fully encapsulated. It has three private fields and each of them has its own set
 of getter and setter methods.

 **/
public class Animal {
    private String name;
    private double averageWeight;
    private int numberOfLegs;

    // Getter methods
    public String getName() {
        return name;
    }
    public double getAverageWeight() {
        return averageWeight;
    }
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setAverageWeight(double averageWeight) {
        this.averageWeight = averageWeight;
    }
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
