import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        MaximumProductOfTwoElementsInAnArray m = new MaximumProductOfTwoElementsInAnArray();
        int[] n = {3,4,5,2};
        m.maxProduct(n);
        System.out.println(m.maxProduct(n));
    }
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-2]-1)*(nums[nums.length-1]-1);
    }
}
