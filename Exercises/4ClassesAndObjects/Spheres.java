import java.util.Scanner;

public class Spheres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = sc.nextDouble();

         double volume = ((4 * Math.PI) * (radius * radius * radius) / 3);
        double surfacearea = (4 * Math.PI * Math.pow(radius, 2));

        System.out.println("The surface area is " + surfacearea);
        System.out.println("The volume is " + volume);
        sc.close();


    }

}
