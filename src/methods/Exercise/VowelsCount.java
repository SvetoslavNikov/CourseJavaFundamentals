package methods.Exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    //int n = Integer.parseInt(scanner.nextLine());
    //double n = Double.parseDouble(scanner.nextLine());
    String s = scanner.nextLine();
        System.out.println(numberOfVowels(s));
    //for(int i = 0; i<n; n++){
    }
    public static int numberOfVowels(String s){
        int count = 0;
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < s.length(); i++) {
            char currentchars= s.charAt(i);
            if(vowels.contains(String.valueOf(currentchars))){
                count++;
            }
        }
        return count;
    }
}
