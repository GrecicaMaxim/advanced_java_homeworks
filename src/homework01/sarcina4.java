package homework01;
import java.util.Scanner;

public class sarcina4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many items in array? ");
        String input = sc.nextLine();
        int choice = Integer.parseInt(input);
        int[] arr = new int[choice]; // creating an array with the number of elements that the user enters
        for (int i = 0; i < choice; i++) {
            // letting the user give the elements themselves too
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        // calculating the sum of elements
        int counter = 0;
        for (int i = 1; i < choice; i += 2) {
            counter += arr[i];
        }
        System.out.print("The sum of elements with odd index is " + counter);
    }
}
