package homework02.arrays;
import java.util.Scanner;

public class sarcina3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initializing the array
        System.out.print("How many items in array? ");
        String input = sc.nextLine();
        int choice = Integer.parseInt(input);
        int[] arr = new int[choice];
        for (int i = 0; i < choice; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        // printing the message
        System.out.print("This array is ");
        if (!isSorted(arr)) {
            System.out.print("NOT ");
        }
        System.out.print("sorted.");
    }

    // this method returns true if the array is sorted, otherwise returns false
    public static Boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) return false;
        }
        return true;
    }
}
