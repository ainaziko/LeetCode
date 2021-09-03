package September;

import java.util.HashMap;
import java.util.Map;


public class FindLuckyIntegerInAnArray {
    public static void main(String[] args) {
        int[] arr = {7,7,7,7,7,7,7};
        FindLuckyIntegerInAnArray f = new FindLuckyIntegerInAnArray();
        System.out.println(f.findLucky(arr));

    }

    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else {
                map.put(i, 1);
            }
        }
        int ans = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey().equals(entry.getValue())){
                ans = Math.max(ans, entry.getKey());
            }
        }
        if(ans == 0) return -1;
        return ans;
    }

    /*public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(Integer i: arr){
            set.add(i);
        }
        for(Integer i: set){
            map.put(i, 0);
        }

        for(Integer key : arr){
            map.put(key, map.get(key) + 1);
        }


        int[] lucky = new int[map.size()];
        int c = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue().equals(entry.getKey())) {
                lucky[c] = entry.getKey();
                c++;
            }
        }

        Arrays.sort(lucky);
        int ans = lucky[lucky.length - 1];
        if(ans == 0){
            return -1;
        }else {
            return ans;
        }
    }*/
}