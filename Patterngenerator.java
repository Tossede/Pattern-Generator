// Faith
// November 2026
// A program that makes various text patterns using loops.

public class Patterngenerator {

    // Prints rows of stars that grow larger using a while loop.
    public static void stars (int rows) {
        int i = 1;
        while (i <= rows) {
            int j = 0;
            int numStars = 2 * i + 1;
            while (j < numStars) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // Prints a number triangle where each row repeats its row number.
    public static void triangle(int rows) {
        int i = 1;
        while (i <= rows) {
            int j = 0;
            while (j < i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // Prints decreasing odd numbers starting from the given start value.
    public static void odds(int start) {
        for (int i = start; i >= 1; i -= 2) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // Prints a diamond shape that alternates between the letters E and O.
    public static void eo(int maxE) {
        // Top half of the pattern
        for (int i = 1; i <= maxE; i++) {
            char c;
            if (maxE % 2 == 0) {
                if (i % 2 == 1) {
                    c = 'O';
                } else {
                    c = 'E';
                }
            } else {
                if (i % 2 == 1) {
                    c = 'E';
                } else {
                    c = 'O';
                }
            }

            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }

        // Bottom half of the pattern
        for (int i = maxE - 1; i >= 1; i--) {
            char c;
            if (maxE % 2 == 0) {
                if (i % 2 == 1) {
                    c = 'O';
                } else {
                    c = 'E';
                }
            } else {
                if (i % 2 == 1) {
                    c = 'E';
                } else {
                    c = 'O';
                }
            }

            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    // Prints an upside-down pyramid of repeated numbers.
    public static void pyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            int count = (rows - i + 1) * 2 - 1;
            for (int j = 0; j < count; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // Main method to test all the pattern functions.
    public static void main(String[] args) {
        System.out.println("Testing stars:");
        stars(4);

        System.out.println("\nTesting triangle:");
        triangle(5);

        System.out.println("\nTesting odds:");
        odds(9);

        System.out.println("\nTesting eo Pattern:");
        eo(6);

        System.out.println("\nTesting pyramid:");
        pyramid(5);
    }
}