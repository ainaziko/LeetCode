import java.util.ArrayList;

public class CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            target.add(index[i], nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = target.get(i);
        }
        return nums;
    }
    public int[] createTargetArrayM(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            int ind = index[i];
            target[ind] = val;
        }
        return target;
    }
}
