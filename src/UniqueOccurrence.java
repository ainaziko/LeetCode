import java.util.*;

public class UniqueOccurrence {
    public static void main(String[] args) {
        UniqueOccurrence un = new UniqueOccurrence();
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        un.uniqueOccurrences(arr);
        System.out.println(un.uniqueOccurrences(arr));
    }
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> container = new ArrayList<>();
        int count = 0;
        boolean ans = true;

        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            if(i + 1 >= arr.length) {
                count++;
                container.add(count);
                break;
            }
            int next = arr[i+1];
            if(curr == next){
                count++;
            }else {
                count ++;
                container.add(count);
                count = 0;
            }
        }
        Collections.sort(container);

        for(int i = 0; i < container.size(); i++){
            int curr = container.get(i);
            if(i + 1 >= container.size())break;
            int next = container.get(i + 1);
            if(curr == next){
                ans = false;
            }
        }
        return ans;
    }

    public boolean uniqueOccurrencesD(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for(int j : map.values()){
            if(set.contains(j)){
                return false;
            } else {
                set.add(j);
            }
        }
        return true;
    }
}
