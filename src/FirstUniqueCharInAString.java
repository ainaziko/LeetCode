import java.util.HashMap;

public class FirstUniqueCharInAString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(map.get(curr) == 1){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String s = "loveleetcode";
        FirstUniqueCharInAString f = new FirstUniqueCharInAString();
        f.firstUniqChar(s);
        System.out.println(f.firstUniqChar(s));
    }


/*    O(1)
     public int firstUniqChar(String s) {
        int[] cnt = new int[26], pos = new int[26];
        Arrays.fill(pos, -1);
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
            if (pos[s.charAt(i) - 'a'] == -1) {
                pos[s.charAt(i) - 'a'] = i;
            }
        }

        int res = s.length();
        for (int i = 0; i < 26; i++) {
            if (cnt[i] == 1) {
                res = Math.min(pos[i], res);
            }
        }
        return res == s.length() ? -1 : res;
    }*/
}
