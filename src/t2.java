import java.util.Scanner;

public class t2 {
    //Ремонт ot exampreparation
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = Integer.parseInt(scan.nextLine());
        int with = Integer.parseInt(scan.nextLine());
        int nonPaintedPart = Integer.parseInt(scan.nextLine());
        double area = Math.ceil(with * height - with * height * nonPaintedPart / 100);
        while (true) {
            String input = scan.nextLine();
            if (input.equals("Tired!")) {
                System.out.printf("%.0f quadratic m left.", area);
                break;
            }
            int paintLiters = Integer.parseInt(input);
            area -= paintLiters;
            if (area == 0) {
                System.out.println("All walls are painted! Great job, Pesho!");
            } else if (area < 0) {
                area = -area;
                System.out.printf("All walls are painted and you have %.0f l paint left!", area);
            }
        }
    }
}
        /*При получаване на командата "Tired!":
"{квадратни метри} quadratic m left."
{квадратни метри} е повърхнината, която му остава да боядисана.
Aко е останала боя в излишък:
"All walls are painted and you have {литри боя} l
 paint left!"
Aко след боядисването на всички стени, не е останала боя:

*/