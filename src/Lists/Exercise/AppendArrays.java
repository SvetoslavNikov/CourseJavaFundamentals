package Lists.Exercise;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        //String s = scanner.nextLine();
        //for(int i = 0; i<n; n++){
        // Read the input line
        String input = scanner.nextLine();

        // Split the input by '|'
        String[] arrays = input.split("\\|");

        for (int i = arrays.length - 1; i >= 0; i--) {
            List<Integer> numbers = Arrays.stream(arrays[i].trim().split(" "))
                    .map(Integer::parseInt).collect(Collectors.toList());
            Collections.sort(numbers);
            for (int e : numbers
            ) {
                System.out.printf(e + " ");
            }
            //sort(Comparable<? super E> c)
        }
    }
}
