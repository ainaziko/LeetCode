package neocoder.week4;

public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        SearchInRotatedSortedArray2 o = new SearchInRotatedSortedArray2();
        int[] arr = {1,0,1,1,1};
        int target = 0;
        System.out.println(o.search(arr, target));
    }
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target) {
                return true;
            }

            if(!isBSearchWorth(nums, start, nums[mid])){
                start++;
                continue;
            }

            boolean midInF = isInF(nums, start, nums[mid]);

            boolean targetInF = isInF(nums, start, target);

            if(targetInF ^ midInF){
                if(midInF){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }else {
                if(nums[mid] < target){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    public boolean isInF(int[] nums, int start, int el){
        return nums[start] <= el;
    }
    private boolean isBSearchWorth(int[] nums, int start, int el){
        return nums[start] != el;
    }
}
