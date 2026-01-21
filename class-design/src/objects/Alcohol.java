package objects;

public class Alcohol {

    public void printMe() {
        //System.out.println(super.toString());
        //System.out.println(toString());
    }

    //overloading here or overriding!?!?!
    public String toString() {
        return "An alcohol object (" + super.toString() + ")";
    }
}
