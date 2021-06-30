import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class MorseCodeWords {

    public int uniqueMorseRepresentations(String[] words) {
        ArrayList<String> encoded = new ArrayList<String>();
        for(int i = 0; i < words.length; i++){
            encoded.add(encode(words[i]));
        }
        Set<String> set = new LinkedHashSet<String>();
        set.addAll(encoded);
        return set.size();
    }

    private static String encode(String word){
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character, String> map = new HashMap<Character, String>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(char ch = 'a'; ch <= 'z'; ch++){
            map.put(ch, arr[i]);
            i++;
        }
        for(char ch : word.toCharArray()){
            String s = map.get(ch);
            sb.append(s);
        }
        return sb.toString();
    }

    /**
     * public int uniqueMorseRepresentations(String[] words) {
     *
     *
     *         Set<String> unique = new HashSet<String>();
     *
     *         for(String word : words){
     *             unique.add(morseCode(word.toCharArray()));
     *         }
     *
     *         return unique.size();
     *
     *     }
     *
     *     String morseCode(char[] word){
     *         String[] morseCode = new String[]
     *         {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
     *         };
     *         StringBuffer buffer = new StringBuffer();
     *
     *         for(char w :word){
     *             buffer.append(morseCode[w-97]);
     *         }
     *
     *         return buffer.toString();
     *     }
     */
}
