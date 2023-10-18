package midExamPreparation;

import java.util.Scanner;

public class muOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String[] inputArr = input.split("\\|");
        String[] commandArr = new String[2];
        int health = 100;
        int bitcoins = 0;
        for (int i = 0; i < inputArr.length; i++) {
            commandArr = inputArr[i].split(" ");

            if (commandArr[0].equals("potion")) {
                int amount = Integer.parseInt(commandArr[1]);
                int healed = Math.min(100-health, amount);
                health+=healed;
                System.out.printf("You healed for %d hp.%n", healed);
                System.out.printf("Current health: %d hp.%n", health);

            } else if (commandArr[0].equals("chest")) {
                System.out.printf("You found %s bitcoins.%n", commandArr[1]);
                bitcoins += Integer.parseInt(commandArr[1]);

            } else {
                health -= Integer.parseInt(commandArr[1]);
                if (health <= 0) {
                    System.out.printf("You died! Killed by %s.%n" +
                            "Best room: %d", commandArr[0], i+1);
                    break;
                } else {
                    System.out.printf("You slayed %s.%n", commandArr[0]);
                }
            }


        }
        if (health > 0) {
            System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d", bitcoins, health);
        }
    }
}
