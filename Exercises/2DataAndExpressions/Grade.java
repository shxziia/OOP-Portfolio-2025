import java.util.Hashtable;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        String name;
        int lab_points;
        int bonus_points ;
        int total_points ;

        System.out.print("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("\n==\t\t\tStudent Points\t\t\t==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
        System.out.println("\n\nName\t\tLab\t\tBonus\tTotal");
        System.out.println("----\t\t---\t\t-----\t-----");


        String[] names = {"Hafsa", "Inaayah", "Ellie", "Lottie", "Aminah"};
        int[] Lab = {20, 50, 30, 29, 11};
        int[] Bonus = {32, 40, 10, 20, 31};
        int[] Total = {};

        for(String i : names) {
            System.out.println(i);
        }

        for(int i : Lab) {
            System.out.println(i);
        }













    }
}
