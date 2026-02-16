package homework01.sarcina2;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        String input = sc.nextLine();
        byte choice = Byte.parseByte(input);
        System.out.print("The day of the week with the number " + choice + " ");

        // writes the day of the week with the given number

        // although if else method is not the most effective, it works properly
        if (choice == 1) {
            System.out.println("is Monday.");
        } else if (choice == 2) {
            System.out.println("is Tuesday.");
        } else if (choice == 3) {
            System.out.println("is Wednesday.");
        } else if (choice == 4) {
            System.out.println("is Thursday.");
        } else if (choice == 5) {
            System.out.println("is Friday.");
        } else if (choice == 6) {
            System.out.println("is Saturday.");
        } else if (choice == 7) {
            System.out.println("is Sunday.");
        } else {
            // if it's not between 1 and 7, it writes an error message
            System.out.println("does not exist.");
        }
    }
}
