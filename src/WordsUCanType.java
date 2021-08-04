public class WordsUCanType {
    public static void main(String[] args) {
        String t = "hello world";
        WordsUCanType w = new WordsUCanType();
        //w.canBeTypedWords(t, "lt");
        System.out.println(w.canBeTypedWords(t, "ahd"));
    }
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int counter = 0;

        for(String word : words){
            boolean typable = true;
            for(int i = 0; i < brokenLetters.length(); i++){
                if(word.contains(String.valueOf(brokenLetters.charAt(i)))){
                    typable = false;
                }
            }
            /*for(int j = 0; j < word.length() - 1; j++){
                if(brokenLetters.indexOf(word.charAt(j)) >= 0){
                    typable = false;
                    break;
                }
            }*/
            if(typable){
                counter++;
            }
        }
        return counter;
    }
}
