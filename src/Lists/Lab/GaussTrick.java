package Lists.Lab;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class GaussTrick {public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
//int n = Integer.parseInt(scanner.nextLine());
//double n = Double.parseDouble(scanner.nextLine());
String s = scanner.nextLine();
//for(int i = 0; i<n; n++){
    List<Integer> numbers = new ArrayList<>(Arrays.stream(s.split(" ")).map(Integer::parseInt).toList());
    for (int i = 0, j = numbers.size()-1; i < numbers.size(); i++, j--) {
        if(j != i ){
            numbers.set(i, numbers.get(j)+numbers.get(i));
            numbers.remove(j);
        }

    }
    System.out.println(numbers);
}
}


