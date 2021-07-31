public class GoatLatin {
    public static void main(String[] args) {
        String sentence = "Each word consists of lowercase and uppercase letters only";
        GoatLatin go = new GoatLatin();
        System.out.println(go.toGoatLatin(sentence));
    }

    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        int i = 1;
        String vowels = "aeiouAEIOU";
        for(String word : words){
            char first = word.charAt(0);
            if(vowels.contains(first + "")){
                word += "ma";
            }else {
                word = word.substring(1) + first + "ma";
            }
            for(int j = 1; j <= i; j++){
                word += 'a';
            }
            i++;
            sb.append(word + " ");
        }
        return sb.toString().trim();
    }
}
