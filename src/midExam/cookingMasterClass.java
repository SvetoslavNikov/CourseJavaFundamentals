package midExam;

import java.util.Scanner;

public class cookingMasterClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());//1 student = 1 flour, 10 eggs, 1 apron
        double flourPrice = Double.parseDouble(scanner.nextLine());//every fifth package is free
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());//20% more round to nextint

        int numberOfFlourPackages = students;
        int freePackages = numberOfFlourPackages / 5;
        numberOfFlourPackages = numberOfFlourPackages - freePackages;
        int numberOfEggs = students * 10;
        int numberOfapron = (int) Math.ceil(students + 0.2 * students);

        double total = eggPrice * numberOfEggs + numberOfFlourPackages * flourPrice + numberOfapron * apronPrice;

        if(total <= budget){
        System.out.printf("Items purchased for %.2f$.", total);}
        else{
            System.out.printf("%.02f$ more needed.", total-budget);
        }
    }
}
