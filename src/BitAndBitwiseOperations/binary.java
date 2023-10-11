package BitAndBitwiseOperations;

import java.util.Scanner;

public class binary {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    int x = Integer.parseInt(scanner.nextLine());
    StringBuilder binary = new StringBuilder();
    while(n != 0){
        binary.append(n%2);
        n = n/2;
    //double n = Double.parseDouble(scanner.nextLine());
    //String s = scanner.nextLine();
    //for(int i = 0; i<n; n++){
    }
        System.out.println(binary.reverse());
    int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            int a = Integer.parseInt(String.valueOf(binary.charAt(i)));
            if(a == x) count++;
        }
        System.out.println(count);
    }
}
