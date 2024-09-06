public class Question4 {

    public static void main(String[] args) {
        printP();
        System.out.println();
        printW();
        System.out.println();
        printSpace(); // For space between "PW" and "SKILL"
        System.out.println();
        printS();
        System.out.println();
        printK();
        System.out.println();
        printI();
        System.out.println();
        printL();
        System.out.println();
        printL();
    }

    // Method to print P
    public static void printP() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || (i == 0 || i == 3) && j < 4 || j == 4 && i > 0 && i < 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Method to print W
    public static void printW() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 0 || j == 6 || (i == j && i > 3) || (i + j == 6 && i > 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Method to print Space
    public static void printSpace() {
        System.out.println();
    }

    // Method to print S
    public static void printS() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == 0 || i == 3 || i == 6) && j < 4 || (j == 0 && i < 3) || (j == 4 && i > 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Method to print K
    public static void printK() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || i + j == 3 || i - j == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Method to print I
    public static void printI() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 6 || j == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Method to print L
    public static void printL() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || i == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
