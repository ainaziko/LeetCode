package neocoder.week4;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {

    }
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(i != s.length() - 1 && map.get(curr) < map.get(s.charAt(i + 1))){
                res += map.get(s.charAt(i + 1)) - map.get(curr);
                ++i;
            }else {
                res += map.get(curr);
            }
        }
        return res;
    }
}
