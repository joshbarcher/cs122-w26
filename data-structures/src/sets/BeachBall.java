package sets;

public class BeachBall implements Comparable<BeachBall> {
    private int diameter;
    private String material;

    public BeachBall(int diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    public int compareTo(BeachBall other) {
        //shorthand for negative, positive, or zero
        return this.diameter - other.diameter;
    }

    public int getDiameter() { return diameter; }
    public String getMaterial() { return material; }

    public String toString() {
        return "BeachBall{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}
