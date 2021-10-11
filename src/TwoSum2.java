package neocoder.week4;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4};
        int target = 6;

        TwoSum2 t = new TwoSum2();
        t.twoSum(arr, target);
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int l = 0;
        int r = numbers.length - 1;
        while (l < r){
            if(numbers[l] + numbers[r] == target){
                ans[0] = l + 1;
                ans[1] = r + 1;
                break;
            }else if(numbers[l] + numbers[r] < target){
                l++;
            }else {
                r--;
            }
        }
        return ans;
    }



    //Used binary search
    public int[] twoSumFirstSolution(int[] numbers, int target) {
        int[] an ={-1};
        int[] ans = new int[2];
        for(int i = 0; i < numbers.length; i++){
            int otherNumb = target - numbers[i];
            int index = binarySearch(numbers, otherNumb, i + 1);//search(numbers, otherNumb, i);
            if(index != -1){
                ans[0] = i + 1;
                ans[1] = index + 1;
                return ans;
            }
        }
        return an;
    }


    public int binarySearch(int[] nums, int target, int start) {
        int l = start;
        int r = nums.length - 1;

        while (l <= r){
            int mid = (l + r)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                l = mid + 1;
            }else if(target < nums[mid]){
                r = mid - 1;
            }

        }
        return -1;
    }

    public static int search(int[] arr, int otherNumber, int startPoint){
        int l = startPoint;
        int r = arr.length - 1;
        while (l <= r){
            int  mid = l + (r - l)/2;
            if(mid == otherNumber){
                return mid;
            }else if(mid < otherNumber){
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
