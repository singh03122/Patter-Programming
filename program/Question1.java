public class Question1 {
    public static void main(String[] args) {
        int n = 7;

        // program to print A

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1) / 2 || j - i == (n - 1) / 2
                        || i == (n - 1) / 3 && j >= (n - 1) / 2 && j <= (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println(" \n ");

        // System.out.println("This is for B");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 1) / 2 || j == 0 || i == n - 1 && (j < (n - 1) / 2)
                        || j == (n - 1) / 2 && i > 0 && i < n - 1
                        || i == (n - 1) / 2 && j < (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println(" \n ");

        // for C

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 || j == 0 && i > 0 && i < n - 1 || i == n - 1 && j > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println(" \n ");

        // For D

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < n - 1 || j == 0 || i == n - 1 && j < n - 1 || j == n - 1 &&
                        i > 0 && i < n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println(" \n ");

        // for E

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || i == (n - 1) / 2 && j <= (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println(" \n ");

        // for G
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 1) / 2 || j == 0 || i == n - 1 && j < (n - 1) / 2
                        || j == (n - 1) / 2 && i >= (n - 1) / 2 || i == (n - 1) / 2 && j > (n - 1) / 2
                        || j == (n - 1) && i >= (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println(" \n ");

        // for H

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}