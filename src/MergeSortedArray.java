package neocoder.week3;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray mm = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        mm.merge(nums1, m, nums2, n);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j = 0; i < m + n; i++, j++){
            nums1[i] = nums2[j];
        }
/*        for(int i = 0; i < nums1.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(nums1[j] < nums1[j - 1]){
                    int tmp = nums1[j];
                    nums1[j] = nums1[j - 1];
                    nums1[j - 1] = tmp;
                }else {
                    break;
                }
            }
        }*/
        for(int i=0;i<nums1.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums1[j]<nums1[j-1]){
                    int temp=nums1[j];
                    nums1[j]=nums1[j-1];
                    nums1[j-1]=temp;
                }else
                    break;
            }
        }
        for(int num : nums1){
            System.out.print(num + " ");
        }
    }
}
