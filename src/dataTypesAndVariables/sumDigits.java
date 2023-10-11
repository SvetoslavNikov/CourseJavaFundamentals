package dataTypesAndVariables;
import java.util.Scanner;
import java.lang.String;
import java.lang.Math;
public class sumDigits {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        //input
        String n = scan.nextLine();
        int length = n.length();
        int sum = 0;
        for(int i = 0; i<length ; i ++){
            sum = sum + Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        System.out.println(sum);
    }
}
