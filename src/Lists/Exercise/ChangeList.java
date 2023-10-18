package Lists.Exercise;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        //String s = scanner.nextLine();
        //for(int i = 0; i<n; n++){
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input;
        while (true) {
            input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            String command = inputArr[0];
            if (command.equals("Delete")) {
                for (int i = 0; i < numbers.size(); i++) {
                    if(numbers.get(i) == Integer.parseInt(inputArr[1])){
                        numbers.remove(i);
                    }
                }
            } else if (command.equals("Insert")) {
                numbers.add(Integer.parseInt(inputArr[2]),Integer.parseInt(inputArr[1]));
            } else if (command.equals("end")) {
                break;
            }
        }
        for (int e:numbers) {
            System.out.print(e+" ");
        }
    }
}
