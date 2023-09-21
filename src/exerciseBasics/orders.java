package exerciseBasics;

import java.util.Scanner;

public class orders {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int orders = Integer.parseInt(scan.nextLine());
        double capsulePrice;
        int days;
        int capsules;
        double price;
        double total = 0;
        for (int i = 0; i < orders; i++) {
            capsulePrice = Double.parseDouble(scan.nextLine());
            days = Integer.parseInt(scan.nextLine());
            capsules = Integer.parseInt(scan.nextLine());
            price = capsulePrice*capsules*days;
            total += price;
            System.out.printf("The price for the coffee is: $%.02f%n", price);
        }
        System.out.printf("Total: $%.02f", total);
    }
}

