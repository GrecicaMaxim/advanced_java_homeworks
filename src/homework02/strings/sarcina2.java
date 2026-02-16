package homework02.strings;
import java.util.Scanner;

public class sarcina2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // entering the string
        System.out.print("Give a numeral string: ");
        String str = sc.nextLine();

        // setting the index of the first digit
        int i = str.charAt(0) == '-' ? 1 : 0;
        Boolean right = true;
        int number = 0;
        if (str.charAt(i) == '0') {
            if (str.length() == i + 1) {
                number = 0;
            } else {
                right = false;
            }
        } else {
            // forming the number digit by digit
            while (i < str.length()) {
                char j = str.charAt(i);
                if (j >= '0' && j <= '9') {
                    number = number * 10 + ((int) j) - 48;
                } else {
                    right = false;
                }
                i++;
            }
        }

        // printing the message
        if (right) {
            if (str.charAt(0) == '-') {
                number = -number;
            }
            System.out.print("The numeric representation of the string '" + str + "' is " + number);
        } else {
            System.out.print("This string doesn't look like a number.");
        }
    }
}
