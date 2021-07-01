public class Alike {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length()/2);
        String b = s.substring(s.length()/2, s.length());
        String vowels = "aeiouAEIOU";
        int counterA = 0;
        int counterB = 0;
        for(int i = 0; i < a.length(); i++){
            if(vowels.contains(a.charAt(i) + "")){
                counterA++;
            }
            if(vowels.contains(b.charAt(i) + "")){
                counterB++;
            }
        }
        if(counterA == counterB){
            return true;
        }else {
            return false;
        }
    }
}
