package neocoder.week4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DeletedNums {
    public static void main(String[] args) {
        DeletedNums d = new DeletedNums();
        int[] dd = {4,3,2,7,8,2,3,1};
        //d.findDisappearedNumbers(dd);
        d.findDisappearedNumbersS(dd);
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }

    public List<Integer> findDisappearedNumbersS(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[nums.length+1];
        for(int a: nums){
            arr[a]++;
        }

        for(int i=nums.length;i>0;i--){
            if(arr[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}
