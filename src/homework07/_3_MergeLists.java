package homework07;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class _3_MergeLists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        System.out.print("Enter the size of the first list: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the size of the second list: ");
        int n2 = sc.nextInt();
        if (n1 > 0) System.out.println("Enter the elements of the first list: ");
        for (int i = 0; i < n1; i++) {
            System.out.print("list1[" + i + "]: ");
            list1.add(sc.nextInt());
        }
        if (n2 > 0) System.out.println("Enter the elements of the second list: ");
        for (int i = 0; i < n2; i++) {
            System.out.print("list2[" + i + "]: ");
            list2.add(sc.nextInt());
        }
        System.out.println("The first list: " + list1);
        System.out.println("The second list: " + list2);
        System.out.println("The merged list: " + mergeTwoSortedLists(list1, list2));
    }

    public static List<Integer> mergeTwoSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() || j < list2.size()) {
            if (i >= list1.size()) {
                result.add(list2.get(j++));
            } else if (j >= list2.size()) {
                result.add(list1.get(i++));
            } else {
                if (list1.get(i) < list2.get(j)) {
                    result.add(list1.get(i++));
                } else {
                    result.add(list2.get(j++));
                }
            }
        }
        return result;
    }
}
