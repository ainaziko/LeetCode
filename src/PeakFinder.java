package neocoder.week4;

public class PeakFinder {
    public static void main(String[] args) {

    }
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r){
            int mid = (l + r)/2;
            if(nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

/*    int p1 = 0;
    int p2 = nums.length - 1;
    int mid = 0;

        while (p1 < p2){
        if(nums[mid] < nums[mid + 1]) p1 = mid + 1;
        else
            p2 = mid;
    }
        return p1;*/

/*    int p1 = 0;
    int p2 = nums.length - 1;
        while (p1 <= p2){
        int mid = (p2 - p1)/2;
        if(nums[mid] < nums[mid - 1]){
            p2 = mid - 1;
        }else if(nums[mid] < nums[mid + 1]){
            p1 = mid + 1;
        }else {
            return mid;
        }
    }
        return -1;*/
}
