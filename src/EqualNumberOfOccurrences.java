import java.util.*;

public class EqualNumberOfOccurrences {
    public static void main(String[] args) {
        EqualNumberOfOccurrences e = new EqualNumberOfOccurrences();
        e.areOccurrencesEqual("aabacbc");
    }
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] contain = s.toCharArray();
        int [] counter = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            counter[i] = 1;
            for(int j = i + 1; j < s.length(); j++){
                if(contain[i] == contain[j]){
                    counter[i]++;
                    contain[j] = '.';
                }
            }
        }
        for(int i = 0; i <counter.length; i++) {
            if(contain[i] != ' ' && contain[i] != '.'){
                map.put(contain[i],counter[i]);
            }

        }
        Set<Integer> values = new HashSet<Integer>(map.values());
        boolean isUnique = values.size() == 1;

        return isUnique;
    }
}

