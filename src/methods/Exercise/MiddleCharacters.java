package methods.Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    //int n = Integer.parseInt(scanner.nextLine());
    //double n = Double.parseDouble(scanner.nextLine());
    String s = scanner.nextLine();
    //for(int i = 0; i<n; n++){
    printMiddleChar(s);
    }
    public static void printMiddleChar(String s){
        int n = s.length();
        if(n%2 == 1){
            System.out.println((char)s.charAt(n - n/2 - 1));
        } else{
            System.out.printf("%c%c",s.charAt(n - n/2 -1),s.charAt(n - n/2));
        }
    }
}
