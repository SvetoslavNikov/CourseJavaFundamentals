package dataTypesAndVariables.MoreExercise;

// FROM CHATGPT MAKE IT YOURSELF
import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter data (type 'END' to exit):");
        while (true) {
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("END")) {
                break;
            }

            if (isInteger(input)) {
                System.out.println(input + " is Integer type");
            } else if (isFloatingPoint(input)) {
                System.out.println(input + " is Floating point type");
            } else if (isBoolean(input)) {
                System.out.println(input + " is Boolean type");
            } else if (isCharacter(input)) {
                System.out.println(input + " is Character type");
            } else {
                System.out.println(input + " is String type");
            }
        }

        scanner.close();
    }

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isFloatingPoint(String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isBoolean(String input) {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
    }

    public static boolean isCharacter(String input) {
        return input.length() == 1;
    }
}
