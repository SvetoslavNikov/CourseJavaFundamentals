package methods;

import java.util.Scanner;

public class fullName {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = readFullName(scanner);
        System.out.println(a);
    }

    public static String readFullName(Scanner scan){
        String firstName = scan.nextLine();
        String secondName = scan.nextLine();
        return firstName + " " + secondName;
    }
}

