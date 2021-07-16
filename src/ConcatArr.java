public class ConcatArr {
    public static void main(String[] args) {
        ConcatArr c = new ConcatArr();
        int [] nums = {1,2,3,4};
        c.getConcatenation(nums);
    }
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        int b = 0;
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < nums.length; j++){
                arr[b] = nums[j];
                b++;
            }
        }
        return arr;
    }
}
