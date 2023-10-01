package dataTypesAndVariables.MoreExercise;

import java.math.MathContext;
import java.util.Scanner;
import java.math.BigDecimal;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String result = " ";
        for (int i = 0; i < n; i++) {
            String a = scanner.nextLine();
            if (a.charAt(0) == '(') {
                result = "UNBALANCED";
            }
            if (result.equals("UNBALANCED")) {
                if (a.charAt(0) == ')') {
                    result = "BALANCED";
                }
            }
        }
        System.out.println(result);

    }
}