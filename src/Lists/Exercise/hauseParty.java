package Lists.Exercise;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class hauseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Ncommands = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        //String s = scanner.nextLine();
        //for(int i = 0; i<n; n++){
        List<String> people = new ArrayList<>();
        for (int i = 0; i < Ncommands; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            String name = inputArr[0];
            if (inputArr[2].equals("going!")) {
                if (people.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    people.add(name);
                }
            } else if (inputArr[2].equals("not")) {
                if (people.contains(name)) {
                    people.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }

        for (String s : people) {
            System.out.println(s);
        }
    }
}

