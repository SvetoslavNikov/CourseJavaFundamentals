package methods.Exercise;

import java.util.Scanner;

public class polindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//int n = Integer.parseInt(scanner.nextLine());
//double n = Double.parseDouble(scanner.nextLine());
        String s;
        while (true) {
            s = scanner.nextLine();
            if (s.equals("END")) {
                break;
            }
            PalindromeOrNot(s);
        }
    }

    public static void PalindromeOrNot(String s) {
        int n = s.length();
        boolean isPolindrome = true;
        if (n % 2 == 0) {
            for (int i = 0, j = n - 1; i < n / 2 && j > n / 2 - 1; i++, j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    isPolindrome = false;
                    break;
                }
            }
        } else {
            for (int i = 0, j = n - 1; i < n / 2 + 1 && j > n / 2 + 1; i++, j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    isPolindrome = false;
                    break;
                }
            }

        }
        System.out.println(isPolindrome);
    }

}

