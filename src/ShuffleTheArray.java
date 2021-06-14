public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] container = new int[nums.length];
        int start1 = 0;
        int start2 = nums.length - n;
        String s = "first";
        for(int i = 0; i < nums.length; i++){
            if(s == "first"){
                container[i] = nums[start1];
                start1++;
                s = "second";
            }else {
                container[i] = nums[start2];
                start2++;
                s = "first";
            }
        }
        return container;
    }
}
// https://leetcode.com/problems/shuffle-the-array/