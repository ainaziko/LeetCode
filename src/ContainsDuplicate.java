package neocoder.week3;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate c = new ContainsDuplicate();
        int[] arr = {1,2,3,1};
        c.containsDuplicate(arr);
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        return !(set.size() == nums.length);
    }
}
