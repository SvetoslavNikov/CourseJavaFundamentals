package dataTypesAndVariables.MoreExercise;

import java.math.MathContext;
import java.util.Scanner;
import java.math.BigDecimal;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor < n; divisor++) {
                if (i % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }
    }
}