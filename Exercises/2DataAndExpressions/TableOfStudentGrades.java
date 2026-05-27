import java.util.Scanner;

public class TableOfStudentGrades {
    public static void main(String[] args) {

        String name;
        int lab_points;
        int bonus_points ;
        int total_points ;


        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Name: " + name);

        lab_points = input.nextInt();
        System.out.println("Lab Points: " + lab_points);

        bonus_points = input.nextInt();
        System.out.println("Bonus Points: " + bonus_points);

        total_points = lab_points + bonus_points;
        System.out.println("Total Points: " + total_points);



    }
}
