import java.util.Scanner;
import java.util.Random;

public class Dice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numofdice1;
        int numofdice2;
        int roll;

        System.out.println("Enter the number of sides on Dice 1: ");
        numofdice1 = sc.nextInt();

        System.out.println("Enter the number of sides on Dice 2: ");
        numofdice2 = sc.nextInt();

        roll = random.nextInt(numofdice1) + 1;

        if (numofdice1 > 0) {

            for (int i = 0; i <= numofdice1; i++) {
                System.out.println("Dice 1 first roll = " + roll);
                return;


                    }


                }

            }


        }





