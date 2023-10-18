package Lists.Exercise;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        //String s = scanner.nextLine();
        //for(int i = 0; i<n; n++){
        List<Integer> wagons = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));
        int capacity = Integer.parseInt(scanner.nextLine());
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else if (input.contains("Add")) {
                String[] command = input.split(" ");
                wagons.add(Integer.parseInt(command[1]));
            } else {
                int passengers = Integer.parseInt(input);
                for (int i = 0; i < wagons.size(); i++) {
                    int seatsLeftInWagon = capacity - wagons.get(i);
                    if (seatsLeftInWagon >= passengers) {
                        wagons.set(i, wagons.get(i) + passengers);
                        break;
                    }

                }
            }
        }
        for (int e : wagons) {
            System.out.print(e + " ");
        }
    }
}
/*
.
..
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
 */