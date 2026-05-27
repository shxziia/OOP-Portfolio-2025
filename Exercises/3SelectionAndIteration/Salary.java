import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.NumberFormat;
public class Salary {
    public static void main(String[] args) {

                double currentSalary;
                double raise = 0.0;
                double newSalary;
                String rating;

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the current salary: ");
                currentSalary = sc.nextDouble();
                System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
                rating = sc.next();

                newSalary = currentSalary + raise;
                NumberFormat money = NumberFormat.getCurrencyInstance();

                if (rating.equals ("Excellent")) {
                    raise = currentSalary * 0.06;
                }
                else if(rating.equals ("Good")) {
                    raise = currentSalary * 0.04;
                }
                else if(rating.equals ("Poor")) {
                    raise = currentSalary * 0.015;
                }
                else
                    System.out.println("You don't have a raise!");

                newSalary = currentSalary + raise;

                System.out.println();
                System.out.println("Current Salary:       " + money.format(currentSalary));
                System.out.println("Amount of your raise: " + money.format(raise));
                System.out.println("Your new salary:      " + money.format(newSalary));
                System.out.println();
    }
}









