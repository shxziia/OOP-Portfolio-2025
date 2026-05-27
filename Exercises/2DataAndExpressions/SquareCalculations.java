import java.util.Scanner;
public class SquareCalculations {
    public static void main(String[] args) {
        double length, perimeter, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of square: ");
        length = input.nextDouble();
        input.close();

        perimeter = (length * 4);
        System.out.println("Perimeter of the square: " + perimeter);
        area = length * length;
        System.out.println("Area of the square: " + area);

    }
}

