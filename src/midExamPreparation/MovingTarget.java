package midExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());

        String numbers = scanner.nextLine();
        List<Integer> numbersList = new ArrayList<>(Arrays.stream(numbers.split(" ")).map(Integer::parseInt).toList());
        //for (int s : numbersList) System.out.println(s);}
        Integer i = numbersList.get(5);

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("End")) {
                break;
            }
            String[] commandArr = command.split(" ");
            int index = Integer.parseInt(commandArr[1]);


            int element;
            int result;
            switch (commandArr[0]) {

                case "Strike":

                    int radius = Integer.parseInt(commandArr[2]);
                    if(index+radius > numbersList.size() - 1 || index-radius<0){
                        System.out.println("Strike missed!");
                        continue;
                    }
                    List<Integer> indexes = new ArrayList<>();
                    indexes.add(index);
                    if (radius > 0) {
                        for (int j = 1; j <= radius; j++) {
                            indexes.add(index + j);
                            indexes.add(index - j);
                        }
                    }

                    //remove
                    for (int j = 0; j < indexes.size(); j++) {
                        numbersList.remove(indexes.get(j));
                    }
                    break;

                case "Shoot":

                    if (index > numbersList.size() - 1 || index < 0) {
                        continue;
                    }

                    element = numbersList.get(index);
                    result = element - Integer.parseInt(commandArr[2]);
                    if (result <= 0) {
                        numbersList.remove(index);
                    } else {
                        numbersList.set(index, result);
                    }

                    break;

                case "Add":

                    if (index > numbersList.size() - 1 || index < 0) {
                        System.out.println("Invalid placement!");
                        continue;
                    }

                    element = numbersList.get(index);
                    result = element + Integer.parseInt(commandArr[2]);
                    numbersList.set(index, result);

                    break;
            }
        }
        for (int e :numbersList) {
            System.out.print(e+"|");
        }
    }
}

