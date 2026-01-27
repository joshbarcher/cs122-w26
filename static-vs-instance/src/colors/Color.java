package colors;

public class Color {
    public int red;
    public int green;
    public int blue;

    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 255;

    //constructors, getters/setters, toString()

//    public void printColor() {
//        System.out.println("(" + red + "," + green + "," +
//                           blue + ")");
//    }

    public void printColor() {
        System.out.println("(" + red + "," + green + "," +
                blue + ")");
    }
}
