public class RunningSumOfOneDArray {
    public int[] runningSum(int[] nums) {
        int counter = 0;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            counter += nums[i];
            ans[i] = counter;
        }
        return ans;
    }
}
