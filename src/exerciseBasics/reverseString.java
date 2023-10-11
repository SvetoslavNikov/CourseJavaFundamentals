package exerciseBasics;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        //int lostGames = Integer.parseInt(scan.nextLine());
        //double headsetP = Double.parseDouble(scan.nextLine());
        String word = scan.nextLine();
        int count;
        count = word.length();
        for (int i = count - 1; i > -1; i--) {
            char a = word.charAt(i);
            System.out.print(a);
        }
        System.out.println(" ");
    }
}



