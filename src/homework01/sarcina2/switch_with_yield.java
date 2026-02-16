package homework01.sarcina2;
import java.util.Scanner;

public class switch_with_yield {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        String input = sc.nextLine();
        byte choice = Byte.parseByte(input);
        System.out.print("The day of the week with the number " + choice + " ");

        // writes the day of the week with the given number

        // switch with yield lets us know which variable/constant will save the switch result
        String action = switch (choice) {
            case 1 -> {
                yield "is Monday.";
            }
            case 2 -> {
                yield "is Tuesday.";
            }
            case 3 -> {
                yield "is Wednesday.";
            }
            case 4 -> {
                yield "is Thursday.";
            }
            case 5 -> {
                yield "is Friday.";
            }
            case 6 -> {
                yield "is Saturday.";
            }
            case 7 -> {
                yield "is Sunday.";
            }
            default -> {
                // if it's none of the above cases, it yields an error message
                yield "does not exist.";
            }
        };
        System.out.println(action);
    }
}