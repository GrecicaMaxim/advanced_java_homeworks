package homework02.strings;
import java.util.Scanner;

public class sarcina3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entering the needle and the haystack
        System.out.print("Give the main string (haystack): ");
        String haystack = sc.nextLine();
        System.out.print("Give the substring (needle): ");
        String needle = sc.nextLine();

        // finding the position where the needle starts
        int result = strStr(haystack, needle);

        // printing the message
        System.out.print("The needle ");
        if (result < 0) {
            System.out.print("is NOT");
        } else {
            System.out.print("starts at index " + result);
        }
        System.out.print(" in the haystack.");
    }

    // this method determines the starting position of a substring (needle) in a string (haystack)
    public static int strStr(String haystack, String needle) {
        Boolean found = false;
        int index = -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            //if we find the first letter of needle in haystack, then compare letter by letter
            if (haystack.charAt(i) == needle.charAt(0)) {
                index = i;
                found = true;
                for (int j = i; j < needle.length() + i && found; j++) {
                    //if at least one pair of letters doesn't match, set index to -1
                    if (!(haystack.charAt(j) == needle.charAt(j - i))) {
                        index = -1;
                        found = false;
                    }
                }
                if (found) {
                    return index;
                }
            }
        }
        return -1;
    }
}
