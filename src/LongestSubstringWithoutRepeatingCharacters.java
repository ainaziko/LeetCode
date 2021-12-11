import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            char currStCh = s.charAt(i);
            set.add(currStCh);
            for(int j = i + 1; j < s.length(); j++){
                char curCh = s.charAt(j);
                if(set.contains(curCh)){
                    set.clear();
                    break;
                }
                set.add(curCh);
                if(set.size() > max)
                    max = set.size();
            }
            if(set.size() > max)
                max = set.size();
        }
        return max;
    }

}
