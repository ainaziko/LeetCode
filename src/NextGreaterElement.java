package September;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int startIndex;
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    startIndex = j;
                    int next = findNextGreater(nums2, nums1[i], startIndex);
                    ans[i] = next;
                }
            }
        }
        return ans;
    }

    private static int findNextGreater(int[] nums2, int curr, int startIndex) {
        int ans = -1;
        for(int i = startIndex; i < nums2.length; i++){
            if(nums2[i] > curr){
                ans = nums2[i];
                break;
            }
        }
        return ans;
    }
}
