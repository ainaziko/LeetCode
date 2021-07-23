import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int index1 = 0;
        int index2 = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while (true){
            if(index1 == nums1.length || index2 == nums2.length){
                break;
            }
            if(nums1[index1] == nums2[index2]){
                res.add(nums1[index1]);
                index1++;
                index2++;
            }else if(nums1[index1] < nums2[index2]){
                index1++;
            }else {
                index2++;
            }
        }
        int[] ans = new int[res.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
