package homework02;
import java.util.Scanner;

public class sarcina2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initializing the array
        System.out.print("How many items in array? ");
        String input = sc.nextLine();
        int choice = Integer.parseInt(input);
        int[] arr = new int[choice];
        for (int i = 0; i < choice; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Which number do you wanna find? ");
        int x = sc.nextInt();

        // writes a message about the first apparition of the target element in array
        int result = findIndex(arr, x);
        System.out.print("The number " + x + " ");
        if (result >= 0) {
            System.out.print("appears for the first time in the array at index " + result + ".");
        } else {
            System.out.print("does not exist in the array.");
        }
    }

    // this method returns the first apparition of the target element in array
    public static int findIndex(int[] arr, int target) {
        Boolean found = false;
        for (int i = 0; !found && i < arr.length; i++) {
            found = arr[i] == target;
            if (found) return i;
        }
        // if the target element is not in the array, it returns -1
        return -1;
    }
}
