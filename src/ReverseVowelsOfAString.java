package neocoder.week3;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        ReverseVowelsOfAString r = new ReverseVowelsOfAString();
        System.out.println(r.reverseVowels("aA"));
    }

    public String reverseVowels(String s) {
        char[] arr = new char[s.length()];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            char curr = s.charAt(i);
            if(isVowel(s.charAt(i))){
                sb.append(curr);
                arr[i] = '\u0000';
            }else {
                arr[i] = curr;
            }
        }

        sb = sb.reverse();

        int sbCount = 0;

        for(int i = 0; i < arr.length; i++){
            char curr = arr[i];
            if(curr == '\u0000'){
                arr[i] = sb.charAt(sbCount);
                sbCount++;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : arr){
            ans.append(ch);
        }

        return ans.toString();
    }

    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'
                || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                || ch == 'u' || ch == 'U' ;
    }
}
