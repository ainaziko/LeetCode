package neocoder.week4;

public class RotatedSortedArray {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r){
            int mid = l + (r - l)/2;
            if(target == nums[mid]){
                return mid;
            }
            //left sorted arr
            if(nums[l] <= nums[mid]){
                if(target < nums[l] || target > nums[mid]){
                    l = mid + 1;
                }else {
                    r = mid - 1;
                }
                //right sorted arr
            }else {
                if(target < nums[mid] || target > nums[r]){
                    r = mid - 1;
                }else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}
