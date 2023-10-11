package methods.Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        //String s = scanner.nextLine();
        //for(int i = 0; i<n; n++){
        int n1factorel = 1;

        for(int i = 1; i<=n1; i++){
            n1factorel *=i;

        }


        System.out.printf("%.2f",  ((double)n1factorel/n2));
    }
}

