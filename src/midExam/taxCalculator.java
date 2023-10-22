package midExam;

import java.util.Scanner;

public class taxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        String[] firstInputArr = scanner.nextLine().split(">>");

        double intialTax = 0;
        double totalToPay = 0;
        double totalCollected = 0;
        for (int i = 0; i < firstInputArr.length; i++) {

            String[] secondInputArr = firstInputArr[i].split(" ");
            int years = Integer.parseInt(secondInputArr[1]);
            int km = Integer.parseInt(secondInputArr[2]);

            if (firstInputArr[i].contains("family")) {
                intialTax = 50;
                intialTax += (km/3000)*12;
                intialTax -= 5*years;


            }else if (firstInputArr[i].contains("heavyDuty")) {
                intialTax = 80;
                intialTax += (km/9000)*14;
                intialTax -= 8*years;


            } else if (firstInputArr[i].contains("sports")) {
                intialTax = 100;
                intialTax += (km/2000)*18;
                intialTax -= 9*years;


            }else{
                System.out.println("Invalid car type.");
                continue;
            }
            
            totalToPay = intialTax;
            totalCollected+=totalToPay;
            System.out.printf("A %s car will pay %.2f euros in taxes.%n" ,secondInputArr[0], totalToPay);
            //for(int i = 0; i<n; n++){

        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", totalCollected);
    }
}

