package homework07;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class _2_RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.print("How many numbers would you like to enter? ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the sorted array:\n");
        for (int i = 0; i < n; i++) {
            System.out.print("nums[" + i + "] = ");
            nums.add(sc.nextInt());
        }
        System.out.println("Initial array list: " + nums);
        System.out.println("The array list turned into set: " + removeDuplicates(nums));
    }

    public static List<Integer> removeDuplicates(List<Integer> sortedList) {
        // changing the address in order to keep the original list
        sortedList = new ArrayList<>(sortedList);

        List<Integer> result = new ArrayList<>();
        while (!sortedList.isEmpty()) {
            int first = sortedList.getFirst();
            if (!result.contains(first)) {
                result.add(first);
                while (sortedList.contains(first)) {
                    sortedList.remove(sortedList.indexOf(first));
                }
            }
        }
        return result;
    }
}
