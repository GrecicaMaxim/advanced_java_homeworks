package homework07;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class _5_MoveZerosToEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.print("How many numbers would you like to enter? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("nums[" + i + "] = ");
            nums.add(sc.nextInt());
        }
        System.out.println("Initial array list: " + nums);
        System.out.println("Array list with moved zeros: " + moveZeros(nums));
    }

    public static List<Integer> moveZeros(List<Integer> nums) {
        // changing the address in order to keep the original list
        nums = new ArrayList<>(nums);

        int counter = 0;
        while (nums.contains(0)) {
            nums.remove(nums.indexOf(0));
            counter++;
        }
        for (int i = 0; i < counter; i++) {
            nums.add(0);
        }
        return nums;
    }
}
