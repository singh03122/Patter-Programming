public class Question5 {

    public static void main(String[] args) {
        printR();
        System.out.println();
        printO();
        System.out.println();
        printH();
        System.out.println();
        printI();
        System.out.println();
        printT();
    }

    // Method to print R
    public static void printR() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || (i == 0 || i == 3) && j < 4 || (j == 4 && i > 0 && i < 3) || (i == j && i > 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Method to print O
    public static void printO() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == 0 || i == 6) && j > 0 && j < 4 || (j == 0 || j == 4) && i > 0 && i < 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Method to print H
    public static void printH() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 || i == 3) {
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

    // Method to print T
    public static void printT() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
