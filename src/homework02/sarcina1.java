package homework02;
import java.util.Scanner;

public class sarcina1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initializing the array
        // [4, 1, 3, 2, 5, 6]
        System.out.print("How many items in array? ");
        String input = sc.nextLine();
        int choice = Integer.parseInt(input);
        int[] arr = new int[choice];
        for (int i = 0; i < choice; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        // determining the 2 minimal values in the array, as well as their position
        int firstMin = arr[0], firstIndex = 0;
        int secondMin = Integer.MAX_VALUE, secondIndex = Integer.MAX_VALUE;
        for (int i = 1; i < choice; i++) {
            if (arr[i] < secondMin) {
                if (arr[i] < firstMin) {
                    secondMin = firstMin;
                    secondIndex = firstIndex;
                    firstMin = arr[i];
                    firstIndex = i;
                } else {
                    // this block executes if the current element is between firstMin and secondMin
                    secondMin = arr[i];
                    secondIndex = i;
                }
            }
        }

        // writing not only the minimal values themselves, but also the indexes of their first apparition
        System.out.println("The 2 smallest elements in the array are " + firstMin + " and " + secondMin + ".");
        System.out.println("Those have indexes " + firstIndex + " and " + secondIndex + " respectively.");
    }
}
