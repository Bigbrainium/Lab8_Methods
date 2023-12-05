import java.util.Scanner;

public class Helper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    }

    // Gets a string with a length greater than 0
    public static String getNonZeroLenString(Scanner scan, String prompt) {
        String input;

        do {
            System.out.println(prompt);
            input = scan.nextLine();

            if (input.length() > 0) {
                break;
            } else {
                System.out.println("Invalid prompt. Please try again");
            }

        } while (true);

        System.out.println(input);
        return input;
    }

    // Ask the user for an int and verifies if the number inputted is an int
    public static int getInt(Scanner scan, String prompt) {
        int value = 0;
        System.out.println(prompt);

        do {
            if (scan.hasNextInt()) {
                value = scan.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please try again");
            }
            scan.nextLine();
        } while (true);

        return value;
    }

    // Ask the user for a double and verifies if the number inputted is a double
    public static double getDouble(Scanner scan, String prompt) {
        double value = 0;
        System.out.println(prompt);

        do {
            if (scan.hasNextDouble()) {
                value = scan.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please try again");
            }
            scan.nextLine();
        } while(true);

        return value;
    }

    // Checks if the user's int is greater than 0
    public static int getPositiveNonZeroInt(Scanner scan, String prompt) {
        int value = 0;
        System.out.println(prompt);

        do {
            if (scan.hasNextInt()) {
                value = scan.nextInt();

                if (value > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please try again");
                }

            } else {
                System.out.println("Invalid input. Please try again");
            }
            scan.nextLine();
        } while (true);

        return value;
    }


    // Checks if the user's int is within a given range
    public static int getRangedInt(Scanner scan, String prompt, int min, int max) {
        int value = 0;

        System.out.println(prompt);

        do {
            if (scan.hasNextInt()) {
                value = scan.nextInt();

                // Checks if the value is in range
                if (value <= max && value >= min) {
                    break;
                } else {
                    System.out.println("Invalid input. Please try again");
                }
            } else {
                System.out.println("Invalid input. Please try again");
            }
            scan.nextLine();
        } while(true);

        return value;
    }

    // Checks if the user's int is within a given range
    public static double getRangedDouble(Scanner scan, String prompt, double min, double max) {
        double value = 0.0;

        System.out.println(prompt);

        do {
            if (scan.hasNextDouble()) {
                value = scan.nextDouble();

                // Checks if the value is in range
                if (value <= max && value >= min) {
                    break;
                } else {
                    System.out.println("Invalid input. Please try again");
                }
            } else {
                System.out.println("Invalid input. Please try again");
            }
            scan.nextLine();
        } while(true);

        return value;
    }

    // Confirms if the user will continue (Y) or stop (N)
    public static boolean getYNConfirm(Scanner scan, String prompt) {
        boolean YN;
        String confirmation;

        System.out.println(prompt);

        do {
            confirmation = scan.nextLine();
            if (confirmation.equalsIgnoreCase("y")) {
                YN = true;
                break;
            } else if (confirmation.equalsIgnoreCase("n")) {
                YN = false;
                break;
            } else {
                System.out.println("Invalid input. Please try again");
            }
        } while (true);

        return YN;
    }

    // Finds specific lines of numbers (DoB, SSN, etc)
    public static String getRegExString(Scanner scan, String prompt, String regEx) {
        String input;

        do {
            System.out.println(prompt);
            input = scan.nextLine();
            if (input.matches(regEx)) {
                break;
            } else {
                System.out.println("Invalid input. Please try again");
            }
        } while (true);

        return input;
    }

    // Creates a pretty header (idk what it actually does yet)
    public static void prettyHeader(String msg) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 60; j++) {
                if (i==1 && j > 3 && j < 57) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println(" ");
        }
    }
}