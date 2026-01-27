package program;

import colors.Color;

public class ColorsProgram {
    public static void main() {
        Color color1 = new Color();
        color1.red = 100;
        color1.blue = 20;
        color1.green = 253;

        Color color2 = new Color();
        color2.red = 13;
        color2.blue = 120;
        color2.green = 51;

        color1.printColor();
        color2.printColor();

        if (color1.red < Color.MIN_VALUE || color1.red > Color.MAX_VALUE) {
            System.out.println("Invalid red component");
        }

        if (color2.red < Color.MIN_VALUE || color2.red > Color.MAX_VALUE) {
            System.out.println("Invalid red component");
        }

        //Color.printColor();
        //Color.printColor();

        //System.out.println(Color.red);
    }
}
