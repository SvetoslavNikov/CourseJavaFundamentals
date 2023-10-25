package objectsAndClasses.Lab;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class randomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        //String s = scanner.nextLine();
        //for(int i = 0; i<n; n++){
        //
        /*LocalDate dr = LocalDate.of(2002, 12, 22);
        LocalDate n = LocalDate.of(2002, 6, 22);
        Random randomNumber = new Random();
        int rnd = randomNumber.nextInt(-10, 10);
        System.out.println(rnd);
        n = n.plusDays(rnd);
        System.out.println(dr);
        System.out.println("My birthay is " + n);*/

        List<String> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        Random rnd = new Random();
        List<Integer> repeated = new ArrayList<>();
        int count = 0;
        while (true) {
            if (count == inputList.size()) {
                break;
            }
            int rndNumber = rnd.nextInt(0, inputList.size());

            if (repeated.contains(rndNumber)) {
                continue;
            } else {
                System.out.println(inputList.get(rndNumber));
                count++;
                repeated.add(rndNumber);
            }
        }
    }
}

