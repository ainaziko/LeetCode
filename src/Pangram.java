public class Pangram {
    public boolean checkIfPangram(String sentence) {
        boolean ans = true;
        for(char curr = 'a'; curr <= 'z'; curr++){
            if(!sentence.contains(curr + "")) ans = false;
        }
        return ans;
    }
}
