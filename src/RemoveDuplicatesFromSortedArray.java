public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        r.removeDuplicates(arr);

    }
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            for(int n : nums){
                System.out.print(n + " -");
            }
            System.out.println();
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
                for(int n : nums){
                    System.out.print(n + " !");
                }
                System.out.println();
            }
        }
        return i + 1;
    }
/*    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(i + 1 < nums.length){
                int curr = nums[i];
                int next = nums[i+1];
                if(curr == next){
                    k--;
                }else {
                    nums[i] = nums[i + 1];
                }
            }
        }
        return k;
    }*/
}
