package contest;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        int[] a1 = {3,1};
        int[] a2 = {2,3};
        int[] a3 = {1,2};
        Q1 q = new Q1();
        q.twoOutOfThree(a1, a2, a3);

    }
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set1 = addToSet(nums1);
        HashSet<Integer> set2 = addToSet(nums2);
        HashSet<Integer> set3 = addToSet(nums3);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : set1) {
            int num = i;
            int quant = map.containsKey(num) ? map.get(num) : 0;
            quant ++;
            map.put(num, quant);
        }
        for (int i : set2) {
            int num = i;
            int quant = map.containsKey(num) ? map.get(num) : 0;
            quant ++;
            map.put(num, quant);
        }
        for (int i : set3) {
            int num = i;
            int quant = map.containsKey(num) ? map.get(num) : 0;
            quant ++;
            map.put(num, quant);
        }

        //System.out.println(map.toString() + " map");
        for ( Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if(val > 1){
                ans.add(key);
            }
        }

        System.out.println(ans.toString());

        return ans;
    }

    public static HashSet<Integer> addToSet(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        return set;
    }


    public static HashSet<Integer> maxSet(HashSet<Integer> s1, HashSet<Integer> s2, HashSet<Integer> s3){
        int max = Math.max(s1.size(), s2.size());
        max = Math.max(max, s3.size());
        if(s1.size() == max){
            return s1;
        }else if(s2.size() == max){
            return s2;
        }else {
            return s3;
        }
    }
}
