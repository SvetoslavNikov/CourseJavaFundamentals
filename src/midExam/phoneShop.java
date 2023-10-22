
package midExam;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class phoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        List<String> phones = new java.util.ArrayList<>
                (Arrays.stream(scanner.nextLine().split(", "))
                        .collect(Collectors.toList()));
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] inputArr = input.split(" - ");


            if (input.contains("Add")) {
                if(!(phones.contains(inputArr[1]))){
                phones.add(inputArr[1]);}




            } else if (input.contains("Remove")) {
                phones.remove(inputArr[1]);


            } else if (input.contains("Bonus phone")) {
                String[] oldNew = inputArr[1].split(":");
                int indexOldPhone = phones.indexOf(oldNew[0]);
                if (indexOldPhone != -1) {
                    phones.add(indexOldPhone+1, oldNew[1]);
                }



            } else if (input.contains("Last")) {
                int index = phones.indexOf(inputArr[1]);
                if(index!=-1){
                    phones.add(phones.get(index));
                    phones.remove(index);
                }
            }

        }
        int count = 0;
        for (String s:
             phones) {
            if(count>0){
                System.out.print(", ");
            }
            System.out.print(s);
            count++;
        }
    }
}