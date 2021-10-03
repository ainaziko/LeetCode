package neocoder.week3;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement el = new RemoveElement();
        int[] arr = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(el.removeElement(arr, val));

    }
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val) count++;
            if(nums[i] == val || nums[i] == -1){
                nums[i] = findNext(i, val, nums);
            }
        }
        for(int num : nums){
            System.out.print(num + " ");
        }
        return count;
    }

    public int findNext(int start, int val, int[] arr){
        for(int i = start; i < arr.length; i++){
            if(arr[i] != val && arr[i] != -1){
                int num = arr[i];
                arr[i] = -1;
                return num;
            }
        }
        return 0;
    }
}
