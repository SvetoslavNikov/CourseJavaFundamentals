package methods;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        //int a= Integer.parseInt(scanner.nextLine());
        double b = 0;
        do {
            b = Double.parseDouble(scanner.nextLine());
        }while(b <= 0 || b>6);
        printResult(b);
    }
    public static void printResult(double n){
        if(n < 3 && n >= 2){
            System.out.println("Fail");
        }
        else if(n < 3.5){
            System.out.println("Poor");
        }
        else if(n < 4.5){
            System.out.println("Good");
        }else if(n < 5.5){
            System.out.println("Very good");
        }else if(n <=6){
            System.out.println("Excellent");
        }
    }
}
