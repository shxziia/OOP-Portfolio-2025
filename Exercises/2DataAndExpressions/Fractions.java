import java.util.Scanner;
public class Fractions {
    public static void main(String[] args) {
        int numerator, denominator, decimal;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        numerator = input.nextInt();
        System.out.print("Enter denominator: ");
        denominator = input.nextInt();
        input.close();

        decimal = (numerator/ denominator);
        System.out.println("Fractions to decimal: " + decimal);

    }
}
