package objectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<student> students = new ArrayList<>();
        while(true) {
            String[] inputArr = scanner.nextLine().split(" ");
            if (inputArr[0].contains("end")) {
                break;
            }
            student std = new student(inputArr[0] + " " + inputArr[1], Integer.parseInt(inputArr[2]), inputArr[3]);
            students.add(std);
        }
        String city = scanner.nextLine();
        for (student s:students
             ) {
            if(s.getCity().equals(city)){
                System.out.printf("%s is %d years old%n",s.getName(), s.getAge());
            }

        }


    }
}
