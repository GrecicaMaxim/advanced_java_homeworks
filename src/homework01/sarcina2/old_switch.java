package homework01.sarcina2;
import java.util.Scanner;

public class old_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        String input = sc.nextLine();
        byte choice = Byte.parseByte(input);
        System.out.print("The day of the week with the number " + choice + " ");

        // writes the day of the week with the given number

        // switch works the same as if else method, but it's more readable
        switch (choice) {
            case 1:
                System.out.println("is Monday.");
                break;
            case 2:
                System.out.println("is Tuesday.");
                break;
            case 3:
                System.out.println("is Wednesday.");
                break;
            case 4:
                System.out.println("is Thursday.");
                break;
            case 5:
                System.out.println("is Friday.");
                break;
            case 6:
                System.out.println("is Saturday.");
                break;
            case 7:
                System.out.println("is Sunday.");
                break;
            default:
                // if it's none of the above cases, it writes an error message
                System.out.println("does not exist.");
        }
    }
}
