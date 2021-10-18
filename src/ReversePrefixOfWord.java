package neocoder.week4;

public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        int stop = 0;
        for(int i = 0; i < word.length(); i++){
            char curr = word.charAt(i);
            if(curr == ch){
                stop = i;
                break;
            }
        }
        sb.append(word.substring(0, stop + 1));
        sb = sb.reverse();
        ans.append(sb);
        ans.append(word.substring(stop + 1));
        return ans.toString();
    }
/*    class Solution {
        public String reversePrefix(String word, char ch) {
            StringBuilder sb = new StringBuilder();
            int reverseTillIndex = word.indexOf(ch);

            for (int j = 0; j < word.length() ; j++) {
                if (j <= reverseTillIndex){
                    sb.append(word.charAt(reverseTillIndex - j));
                }
                else{
                    sb.append(word.charAt(j));
                }
            }
            return sb.toString();
        }
    }*/
}
