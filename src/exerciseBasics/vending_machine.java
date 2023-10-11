package exerciseBasics;

import java.util.Scanner;

public class vending_machine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double coin;
        String command;
        while (true) {
            command = scan.nextLine();
            if (command.equals("Start")) {
                break;
            } else {
                coin = Double.parseDouble(command);
                if (coin == 0.1) {
                    sum += 0.1;
                } else if (coin == 0.2) {
                    sum += 0.2;
                } else if (coin == 0.5) {
                    sum += 0.5;
                } else if (coin == 1) {
                    sum += 1;
                } else if (coin == 2) {
                    sum += 2;
                } else {
                    System.out.printf("Cannot accept %.02f%n", coin);
                }

            }
        }
        double nuts = 2;
        double water = 0.7;
        double crisps = 1.5;
        double soda = 0.8;
        double coke = 1;
        double sumleft = sum;
        while (true) {
            command = scan.nextLine();
            if (command.equals("End")) {
                break;
            } else if (command.equals("Nuts")) {
                sum -= nuts;
            } else if (command.equals("Water")) {
                sum -= water;
            } else if (command.equals("Crisps")) {
                sum -= crisps;
            } else if (command.equals("Soda")) {
                sum -= soda;
            } else if (command.equals("Coke")) {
                sum -= coke;
            } else {
                System.out.println("Invalid product");
                break;
            }

            if (sum < 0) {
                System.out.println("Sorry, not enough money");
                sum = sumleft;
            } else {
                sumleft = sum;
                System.out.printf("Purchased %s%n", command);
            }
        }
        System.out.printf("Change: %.02f%n", sumleft);
    }

}
//Your task is to calculate the total purchase price from a
// vending machine. Until you receive
// "Start" you will be given different coins that are being
// inserted into the machine. You have to sum them to have the total money
// inserted. There is a problem though.  where the value is formatted
// to the second digit after the decimal point and not add it to the total
// money. On the next few lines until you receive "End" you will be given
// products to purchase. Your machine has, however, only "Nuts", "Water",
// "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively.
//