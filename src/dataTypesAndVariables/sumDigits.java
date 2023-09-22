package dataTypesAndVariables;
import java.util.Scanner;
import java.lang.Math;
public class sumDigits {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        //input
        int n = Integer.parseInt(scan.nextLine());

        //count digits
        int count = 0;
        int number = n;
        do{
            ++count;
            number = number/(10*count);
        }while (number!= 0);

        //find sum of digits and print it
        int sum = 0;
        for(int i = 0; i<count ; i++){
            if (i == 0){
                sum+= n%10;
            } else {
                int k = (int) ((n/(Math.pow(10,i))) % 10);
                sum += k;
            }
        }
        System.out.println(sum);
    }
}
