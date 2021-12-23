package repeat;

public class ArrayShifting {

    public void rotate2(int[] nums, int k) {
        int[] tmp = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int newP = (i + k) % nums.length;
            tmp[newP] = nums[i];
        }
        nums = tmp;
        for(int i : nums){
            System.out.print(i + " ");
        }
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public int[] reverse(int[] arr, int start, int end){
        while(start < end){
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
        return arr;
    }

}
