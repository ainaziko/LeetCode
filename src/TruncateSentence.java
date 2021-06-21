public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");

        for(String word : words){
            sb.append(word);
            counter++;
            if(counter == k) break;
            sb.append(" ");
        }
        return sb.toString();
    }
}
