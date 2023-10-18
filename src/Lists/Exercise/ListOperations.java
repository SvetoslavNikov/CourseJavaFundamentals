package Lists.Exercise;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        //String s = scanner.nextLine();
        //for(int i = 0; i<n; n++){
        List<Integer> integers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String[] inputArr = (scanner.nextLine()).split(" ");
        if (inputArr[1].equals("left")) {
            for (int i = 0; i < Integer.parseInt(inputArr[2]); i++) {
                integers.add(integers.get(0));
                integers.remove(0);
            }
        } else if (inputArr[1].equals("right")) {
            for (int i = 0; i < Integer.parseInt(inputArr[2]); i++) {
                integers.add(0,integers.get(integers.size()-1));
                integers.remove(integers.size()-1);
            }
        }
        for (int e:integers
             ) {
            System.out.print(e +" ");
        }
    }
}
