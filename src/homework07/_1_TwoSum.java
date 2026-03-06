package homework07;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class _1_TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.print("How many numbers would you like to enter? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("nums[" + i + "] = ");
            nums.add(sc.nextInt());
        }
        System.out.print("Enter the target number: ");
        int target = sc.nextInt();
        System.out.println("Initial array list: " + nums);
        System.out.println("The array of indexes of the elements that add up to target is: " + twoSum(nums, target));
    }

    public static List<Integer> twoSum(List<Integer> nums, int target) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.contains(target - nums.get(i)) && nums.indexOf(target - nums.get(i)) > i) {
                result.add(i);
                result.add(nums.indexOf(target - nums.get(i)));
                break;
            }
        }
        return result;
    }
}
