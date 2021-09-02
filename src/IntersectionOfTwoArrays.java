package September;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
//Learned HashSets, built in intersection
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        IntersectionOfTwoArrays i = new IntersectionOfTwoArrays();
        System.out.println(i.intersection(arr1, arr2));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(Integer i : nums1) set1.add(i);
        for(Integer j : nums2) set2.add(j);
        set1.retainAll(set2);
        int[] output = new int[set1.size()];
        int index = 0;
        for(int i : set1){
            output[index++] = i;
        }
        return output;
    }

/*
NAIVE APPROACH
public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 =  new HashSet<>();
        HashSet<Integer> set2 =  new HashSet<>();
        for(int num: nums1){
            set1.add(num);
        }
        for(int num: nums2){
            set2.add(num);
        }
        if(set1.size() < set2.size()) return set_intersection(set1, set2);
        else return set_intersection(set2, set1);
    }

    public int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2){
        int[] output = new int[set1.size()];
        int index = 0;
        for(Integer i : set1){
            if(set2.contains(i)){
                output[index++] = i;
            }
        }
        return Arrays.copyOf(output, index);
    }*/

/*
MY SOLUTION
public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j] && !ans.contains(nums1[i])){
                    ans.add(nums1[i]);
                }
            }
        }
        int[] arr = ans.stream().mapToInt(i -> i).toArray();
        return arr;
    }*/
}
