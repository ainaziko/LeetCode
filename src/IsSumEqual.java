public class IsSumEqual {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        boolean ans;
        if(count(firstWord) + count(secondWord) == count(targetWord)){
            ans = true;
        }else {ans = false;}
        return ans;
    }

    public int count(String s){
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            int num = Character.getNumericValue(ch) - 10;
            sb.append(num);
        }
        return Integer.parseInt(sb.toString());
    }
}
