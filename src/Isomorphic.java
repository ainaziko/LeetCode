package neocoder.week4;

import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        Isomorphic i = new Isomorphic();

        System.out.println(i.isIsomorphic(s,t));
    }

    public boolean isIsomorphic(String s, String t) {
        if(s.length() == t.length()){
            HashMap<Character, Character> map = new HashMap<>();

            for(int i = 0; i < s.length(); i++){
                char myKey = s.charAt(i);
                char myVal = t.charAt(i);
                System.out.println(map.containsValue(myVal));
                if(!map.containsKey(myKey)/* && !map.containsValue(myVal)*/){
                    if(map.containsValue(myVal)){
                        return false;
                    }
                    map.put(myKey, myVal);
                }else {
                    char val = map.get(myKey);
                    if(val != myVal){
                        return false;
                    }
                }
            }
            System.out.println(map);
        }else {
            return false;
        }

        return true;
    }
    /*
    * class Solution {
    public boolean isIsomorphic(String s, String t) {

        int[] mappingDictStoT = new int[256];
        Arrays.fill(mappingDictStoT, -1);

        int[] mappingDictTtoS = new int[256];
        Arrays.fill(mappingDictTtoS, -1);

        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Case 1: No mapping exists in either of the dictionaries
            if (mappingDictStoT[c1] == -1 && mappingDictTtoS[c2] == -1) {
                mappingDictStoT[c1] = c2;
                mappingDictTtoS[c2] = c1;
            }

            // Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping exists and
            // it doesn't match in either of the dictionaries or both
            else if (!(mappingDictStoT[c1] == c2 && mappingDictTtoS[c2] == c1)) {
                return false;
            }
        }

        return true;
    }
}*/
}
