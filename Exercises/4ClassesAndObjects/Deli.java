import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Deli
{

    public static void main (String[] args)
    {
        final double OUNCES_PER_POUND = 16.0;


        double pricePerPound;
        double weightOunces;
        double weight;
        double totalPrice;

        Scanner scan = new Scanner(System.in);


        NumberFormat money = NumberFormat.getCurrencyInstance();
        DecimalFormat fmt = new DecimalFormat("0.00");



        System.out.println ("Welcome to the CS Deli!!\n ");

        System.out.print ("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();


        System.out.print ("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();


        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;


        System.out.println("Total price: " + money.format(totalPrice));
        totalPrice = pricePerPound * weight;

        System.out.println("Unit Price: " + money.format(totalPrice + "per pound"));
        System.out.println("Weight: " + fmt.format(weight) + "pounds");
        System.out.println("Total: " + fmt.format(totalPrice));






    }
}
