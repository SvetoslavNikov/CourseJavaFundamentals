package methods.Exercise;

import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        String pass = scanner.nextLine();
        //for(int i = 0; i<n; n++){
        checkPassword(pass);
    }

    public static void checkPassword(String pass) {
        boolean valid = true;
        if (pass.length() < 6 || pass.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        char[] a = pass.toCharArray();
        int digits = 0;
        int permittedChars = 0;
        for (char e : a) {
            if (e > 47 && e < 58) {
                digits++;
            }
            if (Character.isDigit(e)) {
                continue;
            } else if (Character.isLetter(e)) {
                continue;
            } else {
                permittedChars++;

            }
        }
        if (digits < 2) {
            System.out.println("Password must have at least 2 digits");
            valid = false;
        }
        if (permittedChars > 0) {
            System.out.println("Password must consist only of letters and digit");
        valid = false;
        }
        if(valid){
            System.out.println("Password is valid");
        }
    }
}
