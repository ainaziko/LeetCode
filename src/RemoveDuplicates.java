package neocoder.week3;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates rm = new RemoveDuplicates();
        int[] arr = {1,1,1,2,2,3};
        System.out.println(rm.removeDuplicates(arr));
        System.out.println(arr[-1]);
    }

    public int removeDuplicates(int[] nums) {
        int centerIndex = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[centerIndex - 2]){
                nums[centerIndex++] = nums[i];
            }
        }
        return centerIndex;
    }

    public int removeDuplicatesS(int[] nums) {
        if(nums.length <=2) return nums.length;
        // non-duplicate index pointer
        int nonDupIndex =  2;

        for(int i = 2 ; i< nums.length; i++){
            if(nums[i]!= nums[nonDupIndex-2])
                nums[nonDupIndex++] = nums[i];
        }
        return nonDupIndex;
    }
}

