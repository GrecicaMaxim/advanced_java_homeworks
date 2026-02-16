package homework01.sarcina2;
import java.util.Scanner;

public class switch_enhanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        String input = sc.nextLine();
        byte choice = Byte.parseByte(input);
        System.out.print("The day of the week with the number " + choice + " ");

        // writes the day of the week with the given number

        // enhanced switch doesn't need yield keyword, which increases readability
        String action = switch (choice) {
            case 1 -> "is Monday.";
            case 2 -> "is Tuesday.";
            case 3 -> "is Wednesday.";
            case 4 -> "is Thursday.";
            case 5 -> "is Friday.";
            case 6 -> "is Saturday.";
            case 7 -> "is Sunday.";
            default -> "does not exist.";
        };
        System.out.println(action);
    }
}
