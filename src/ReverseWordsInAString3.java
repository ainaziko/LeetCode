public class ReverseWordsInAString3 {
    public String reverseWords(String s) {
        ReverseWordsInAString3 rev = new ReverseWordsInAString3();
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            sb.append(rev.reverse(arr[i]) + " ");
        }
        return sb.toString();
    }

    public String reverse(String word){
        StringBuilder sb = new StringBuilder();
        sb.append(word);
        return sb.reverse().toString();
    }
}
