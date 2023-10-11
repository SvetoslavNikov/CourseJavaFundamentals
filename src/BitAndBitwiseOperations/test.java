package BitAndBitwiseOperations;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        //String s = scanner.nextLine();
        //for(int i = 0; i<n; n++){
        int x = 11;// 1011
        int y = 5;// 0101
        System.out.println((x&y));//0001
        System.out.println((x|y));//1111 - 15
        System.out.println(x^y);//1110 - 14
        System.out.println((~x));//0100 - 4
        System.out.println((~y));//1010 - 10
        System.out.println(x>>1);
        System.out.println(x<<1);
    }
}

