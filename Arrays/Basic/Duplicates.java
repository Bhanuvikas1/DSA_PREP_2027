package Arrays.Basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 4, 5, 2, 1, 5 };

        // Method should return all the duplicate numbers.
        findDuplicates(nums);

    }

    private static void findDuplicates(int[] nums) {
        Set<Integer> duplicates = new HashSet<>();

        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            if (duplicates.contains(num)) {
                result.add(num);
            }

            duplicates.add(num);
        }

        System.out.println(result);

    }
}
