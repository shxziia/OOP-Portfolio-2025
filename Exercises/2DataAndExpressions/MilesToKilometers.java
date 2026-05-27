import java.util.Scanner;
public class MilesToKilometers {
    public static void main(String[] args) {
        double miles, km;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in miles: ");
        miles = input.nextDouble();
        input.close();

        km = (miles * 1.60935);
        System.out.println("Distance in kilometer: " + km);

    }
}
