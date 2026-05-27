import java.util.Scanner;
public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MIN = 1;
        final int MAX = 100;
        final int LIMIT = 10;
        int[] a = new int[10];

        for (int b = 0; b < a.length; b++) {
            a[b] = 0;
        }
        System.out.println("Enter a number between 1 and 100 (or press 0 to exit): ");
        int n = sc.nextInt();

        while (n != 0) {
            if (n >= MIN && n <= MAX) {
                a[(n - 1) / LIMIT]++;
            } else {
                System.out.println("Invalid input! Please enter a number between 1 and 100.");
                n = sc.nextInt();
            }
            System.out.println("Enter a number between 1 and 100 (or press 0 to exit): ");
            n = sc.nextInt();
        }
            System.out.println("Histogram");
            for (int i = 0; i < a.length; i++) {
                int start = i * LIMIT + 1;
                int end = (i + 1) * LIMIT;
                System.out.print(start + " - " + end + " | ");

                for (int j = 0; j < a[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }
            sc.close();

        }

    }
