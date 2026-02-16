package homework02.strings;
import java.util.Arrays;
import java.util.Scanner;

public class sarcina1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initializing the strings
        System.out.print("Give the first string: ");
        String s1 = sc.nextLine();
        System.out.print("Give the second string: ");
        String s2 = sc.nextLine();

        // determining whether these strings are anagrams (they are made of same letters, no matter the order)
        Boolean is_anagram = false;
        if (s1.length() == s2.length()) {
            if (s1.equals(s2)) {
                is_anagram = true;
            } else {
                // creating 2 arrays to store the ASCII codes of the letters, in order to sort the arrays
                int[] set1 = new int[s1.length()], set2 = new int[s2.length()];
                for (int i = 0; i < s1.length(); i++) {
                    set1[i] = (int) s1.charAt(i);
                    set2[i] = (int) s2.charAt(i);
                }

                // sorting the resulting arrays, then comparing their content
                Arrays.sort(set1);
                Arrays.sort(set2);
                is_anagram = Arrays.equals(set1, set2);
            }
        } else {
            is_anagram = false;
        }

        // printing the message
        System.out.print("These strings ARE ");
        if (!is_anagram) {
            System.out.print("NOT ");
        }
        System.out.print("anagrams.");
    }
}
