package Lists.Lab;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        String s = scanner.nextLine();
        //for(int i = 0; i<n; n++){
        List<Double> numbers = new ArrayList<>(Arrays.stream(s.split(" ")).map(e -> Double.parseDouble(e)).toList());
        int i = 0;
        while(true) {
            for (i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i).equals(numbers.get(i + 1)) ) {
                    numbers.set(i, (2 * numbers.get(i + 1)));
                    numbers.remove(i + 1);
                    break;
                }

            }
            if(i == (numbers.size()-1)){
                break;
            }
        }
        System.out.println(numbers);
    }
}

