package homework07;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class _4_RunningSum {

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
        System.out.println("The running sum list: " + runningSum(nums));
    }

    public static List<Integer> runningSum(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        if (!nums.isEmpty()) {
            result.add(nums.get(0));
        }
        for (int i = 1; i < nums.size(); i++) {
            result.add(result.get(i - 1) + nums.get(i));
        }
        return result;
    }
}
