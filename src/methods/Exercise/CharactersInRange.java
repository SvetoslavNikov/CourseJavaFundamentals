package methods.Exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    //int n = Integer.parseInt(scanner.nextLine());
    //double n = Double.parseDouble(scanner.nextLine());
    //String s = scanner.nextLine();
    //for(int i = 0; i<n; n++){
        char s1 = scanner.nextLine().charAt(0);
        char s2 = scanner.nextLine().charAt(0);
        for(char a : printCharsInBetween(s1,s2)){
            System.out.print(a + " ");
        }
    }
    public static char[] printCharsInBetween(char s1, char s2) {
        int range = Math.abs(s2-s1)-1;
        char[] a = new char[range];
        int index = 0;
        for (int i = s1+1; i < s2; i++) {
            a[index] = (char) i;
            index++;
        }
        return a;
    }
}
