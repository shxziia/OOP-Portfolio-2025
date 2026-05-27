import java.util.Scanner;
public class Postcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] people = new Person[25];
        int count = 0;

        System.out.println("Enter up to 25 names and postal codes (first name, last name, postal code).");
        System.out.println("Type 'done' to stop entering data early.");

        while (count < 25) {
            System.out.print("Enter details for person " + (count + 1) + " (First Name, Last Name, Postal Code): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            String[] data = input.split("\t");

            if (data.length == 3) {
                String firstName = data[0];
                String lastName = data[1];
                String postalCode = data[2];

                people[count] = new Person(firstName, lastName, postalCode);
                count++;
            } else {
                System.out.println("Invalid input. Please enter three values separated by tabs.");
            }
        }

        System.out.println("\nList of People and their Postal Codes:");
        System.out.println("First Name\tLast Name\tPostal Code");

        for (int i = 0; i < count; i++) {
            people[i].printDetails();
        }
    }
}

