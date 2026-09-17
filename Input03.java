import java.util.Scanner;

public class Input03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three integers:");

        int sum = 0;
        int count = 0;

        while (count < 3) {
            System.out.print("Enter integer #" + (count + 1) + ": ");

            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                sum += value;
                count++;
            } else {
                // Handle non‑integer input
                String badInput = sc.next();
                System.out.println("Invalid token: \"" + badInput + "\" (not an int)");
            }
        }

        System.out.println("Sum of the three integers: " + sum);

        sc.close();
    }
}
