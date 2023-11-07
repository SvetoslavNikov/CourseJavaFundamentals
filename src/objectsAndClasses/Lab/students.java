package objectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<studentClass> students = new ArrayList<>();
        while(true) {
            String[] inputArr = scanner.nextLine().split(" ");
            if (inputArr[0].contains("end")) {
                break;
            }

            studentClass std = new studentClass();
            std.setStudentName(inputArr[0] + " " + inputArr[1]);
            std.setStudentAge(Integer.parseInt(inputArr[2]));
            std.setStudentCity(inputArr[3]);
            students.add(std);
        }

        String city = scanner.nextLine();
        for (studentClass s:students
             ) {
            if(s.getStudentCity().equals(city)){
                System.out.printf("%s is %d years old%n",s.getStudentName(), s.getStudentAge());
            }

        }


    }
}
