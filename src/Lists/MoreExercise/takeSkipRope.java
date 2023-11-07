package Lists.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class takeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        StringBuilder s = new StringBuilder();
        List<Character> inputList = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        for (char c : input.toCharArray()) {
            if (c >= '0' && c <= '9') {
                //take every digit
                numbers.add(c - '0');
                //list of chars without the digits in the input

            } else{
                inputList.add(c);
            }
        }

        //create takeList with even numbers and skipList with odd numbers
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(numbers.get(i));
            } else {
                skipList.add(numbers.get(i));
            }
        }

        //build the result
        int takeListIndex = 0;
        int skipListIndex = 0;
        int inputListIndex = 0;
        StringBuilder result = new StringBuilder();
        while (true) {

            if (takeListIndex < takeList.size()) {
                for (int i = 0; i < takeList.get(takeListIndex); i++) {
                    if (inputListIndex < inputList.size()) {
                        result.append(inputList.get(inputListIndex));
                    } else {
                        break;
                    }
                    inputListIndex++;
                }
            }
            takeListIndex++;

            if (inputListIndex < inputList.size()) {

                if (skipListIndex < skipList.size()) {
                    for (int i = 0; i < skipList.get(skipListIndex); i++) {
                        inputListIndex++;
                    }
                } else{break;}
                skipListIndex++;
            } else {
                break;
            }

        }
        System.out.println(result);
    }
}



























