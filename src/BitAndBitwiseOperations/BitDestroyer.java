package BitAndBitwiseOperations;

import java.util.Scanner;

public class BitDestroyer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());//postion
        StringBuilder binary = new StringBuilder();
        while(n != 0){
            binary.append(n%2);
            n = n/2;
        }
        //binary = binary.reverse();
        System.out.println(binary);

        int bit = Integer.parseInt(String.valueOf(binary.charAt(x)));
        int newBit = 111101111&bit;

        //binary.setCharAt(x, (char) (bit + '0'));
        binary = binary.reverse();
        System.out.println(binary);
    }
}