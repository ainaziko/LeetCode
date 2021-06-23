public class ConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        for(String word : words){
            if(check(word, allowed)) counter++;
        }
        return counter;
    }

    public static boolean check(String word, String allowed){
        boolean b = true;
        for(int i = 0; i < word.length(); i++){
            if(!allowed.contains(word.charAt(i)+ "")) b = false;
        }
        return b;
    }
}