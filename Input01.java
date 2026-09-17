import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {

        // Part 1: Get input as a String
        String input = JOptionPane.showInputDialog("Enter a number:");
        System.out.println("You entered (String): " + input);

        // Part 2: Parse the String into an int
        int value = Integer.parseInt(input);
        System.out.println("Parsed int + 1: " + (value + 1));

        // Challenge: Do everything in one line
        int oneLineValue = Integer.parseInt(
                JOptionPane.showInputDialog("Enter another number:")
        );
        System.out.println("One-line parsed value: " + oneLineValue);
    }
}
