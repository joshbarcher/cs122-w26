package multiple_dimensions;

public class Practice {
    public static void main() {
        final int SIZE = 10;
        int[][] multTable = new int[SIZE][SIZE];

        //build the table!
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                int value = (row + 1) * (col + 1);
                multTable[row][col] = value;
            }
        }

        //print the table
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                int value = multTable[row][col];
                if (value < 10) {
                    System.out.print("  " + multTable[row][col] + " | ");
                } else if (value < 100) {
                    System.out.print(" " + multTable[row][col] + " | ");
                } else {
                    System.out.print(multTable[row][col] + " | ");
                }
            }
            System.out.println();
        }
    }

    private static void ratingsTable() {
        //         | EEAAO | Sinners | LOTR | ROTS
        //Todd     | 3     | 4       | 5    | 3
        //Tina     | 2     | 3       | -    | 5
        //Taylor   | 5     | 5       | 5    | 5
        //Susie    | 1     | -       | -    | 2

        int[][] ratings = {
                {3,  4,  5,  3, 5, 4, 1, 2},
                {2,  3},
                {5,  5,  5},
                {1, -1, -1,  2, 5}
        };

        //try printing the rows + columns, with a dash for movies no yet seen
        for (int row = 0; row < ratings.length; row++) {
            for (int col = 0; col < ratings[row].length; col++) {
                if (ratings[row][col] == -1) {
                    System.out.print("-, ");
                } else {
                    System.out.print(ratings[row][col] + ", ");
                }
            }
            System.out.println(); //just a newline!
        }
    }

    private static void stringArrays() {
        //         | Quarterly Goal | Yearly Goal
        //Todd     | Met            | Partial
        //Tina     | Unmet          | Unmet
        //Taylor   | Met            | null

        //String[row][col]
        String[][] kpis = new String[4][11];

        //Todds KPIs
        kpis[0][0] = "Met";
        kpis[0][1] = "Partial";

        kpis[1][0] = "Unmet";
        kpis[1][1] = "Unmet";

        kpis[2][0] = "Met";
        //kpis[2][1] = "Met";

        System.out.println("Did Todd meet this yearly goal? " +
                kpis[0][1]);

        for (int row = 0; row < kpis.length; row++) {
            for (int col = 0; col < kpis[0].length; col++) {
                String value = kpis[row][col];
                System.out.print(" " + value);
            }
            System.out.println();
        }
    }
}
