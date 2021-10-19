package additional;

public class CheckIfStringIsAPrefixOfArray {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            String currWord = words[i];
            sb.append(currWord);
            if(sb.toString().equals(s)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CheckIfStringIsAPrefixOfArray ch = new CheckIfStringIsAPrefixOfArray();
        String s = "z";
        String[] arr = {"z"};

        System.out.println(ch.isPrefixString(s, arr));
    }
}
