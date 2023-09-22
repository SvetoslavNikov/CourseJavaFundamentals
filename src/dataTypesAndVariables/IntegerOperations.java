package dataTypesAndVariables;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        //Add the first to the second, divide (integer)
        //the sum by the third number, and multiply
        // the result by the fourth number. Print the result
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());
        int fourth = Integer.parseInt(scan.nextLine());
        System.out.println(((first + second) / third) * fourth);


    }
}



