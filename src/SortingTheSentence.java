public class SortingTheSentence {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= words.length; i++){
            for(String word : words){
                int num = Character.getNumericValue(word.charAt(word.length()-1));
                if(num == i){
                    sb.append(word.substring(0,word.length()-1));
                    if(i != words.length)sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}
