package Lists.Exercise;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class anonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> mainList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        while (true) {

            String input = scanner.nextLine();
            if (input.equals("3:1")) {
                break;
            }
            StringBuilder word = new StringBuilder();
            String[] inputArr = input.split(" ");
            int[] indexes = {Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2])};


            if (input.contains("merge")) {
                if (indexes[0] < 0) {
                    indexes[0] = 0;
                }
                if (indexes[1] > mainList.size() - 1) {
                    indexes[1] = mainList.size() - 1;
                }
                for (int i = indexes[0]; i <= indexes[1]; i++) {
                    word.append(mainList.get(indexes[0]));
                    mainList.remove(indexes[0]);
                }
                mainList.add(indexes[0], String.valueOf(word));


            } else if (input.contains("divide")) {
                List<String> charsList = Arrays.stream(mainList.get(indexes[0]).split("")).collect(Collectors.toList());
                int numberOfCharsInElement = charsList.size() / indexes[1];
                mainList.remove(indexes[0]);

                for (int i = 0; i < indexes[1]; i++) {
                    StringBuilder element = new StringBuilder();
                    for (int j = 0; j < numberOfCharsInElement; j++) {
                        element.append(charsList.get(0));
                        charsList.remove(0);
                    }
                    if (charsList.size() > 0 && i == indexes[1] - 1) {
                        for (int j = 0; j < charsList.size(); j++) {
                            element.append((charsList.get(j)));
                        }
                    }
                    mainList.add(indexes[0], String.valueOf(element));
                }


                //reversing the added elements
                int start = indexes[0];
                int end = indexes[0] + indexes[1] - 1;

                // Ensure start and end are within valid bounds
                if (start < 0 || end >= mainList.size() || start > end) {
                    System.out.println("Invalid start or end index.");
                    return;
                }

                // Reverse the section
                while (start < end) {
                    // Swap elements at start and end indices
                    Collections.swap(mainList, start, end);
                    start++;
                    end--;
                }


            }
        }


        for (String s : mainList) {
            System.out.print(s + " ");
        }

    }
}


