package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class topIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int n = Integer.parseInt(scan.nextLine());
        String a = scan.nextLine();
        String[] b = a.split(" ");
        int[] c = Arrays.stream(b).mapToInt(value -> Integer.parseInt(value)).toArray();

        for (int i = 0; i < b.length; i++) {
            boolean isTopInteger = true;
            for (int j = i+1; j < b.length; j++) {
                if (c[i] <= c[j]){
                    isTopInteger = false;
                }
            }
            if(isTopInteger){
                System.out.printf("%d ", c[i]);
            }
        }
    }
}