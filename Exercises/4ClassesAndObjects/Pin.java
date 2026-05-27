import java.util.Scanner;
import java.util.Random;

public class Pin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digits = 0;

        System.out.print("Please enter a 4 digit PIN: ");
        digits = sc.nextInt();

        String Hexapin = Integer.toHexString(digits);

        int one = ((int)(Math.random()*1000)*65536);
        int two = ((int)(Math.random()*1000)*65536);

        String oneStr = Integer.toHexString(one);
        String twoStr = Integer.toHexString(two);
        System.out.println("Your encrypted PIN number is: " + oneStr);
    }
}
