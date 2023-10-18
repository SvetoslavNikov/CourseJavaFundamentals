package midExamPreparation;

import java.util.Scanner;

public class computerStore {
    public static int main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double totalPrice = 0;
        String input = "";
        double taxes = 0;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("special")) {
                totalPrice = (sum + taxes) * 0.9;
                break;
            } else if (input.equals("regular")) {
                totalPrice = sum + taxes;
                break;
            } else if (Double.parseDouble(input) < 0) {
                System.out.println("Invalid price!");
                continue;
            }
            sum += Double.parseDouble(input);
            taxes = sum * 0.2;
        }
        if (sum == 0) {
            System.out.println("Invalid order!");
            return 0;
        }
        System.out.printf("Congratulations you've just bought a new computer!" +
                "%nPrice without taxes: %.2f$%nTaxes: %.2f$%n", sum, taxes);
        System.out.printf("-----------%nTotal price: %.2f$", totalPrice);

        return 0;
    }
}



