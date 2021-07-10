public class BalancedString {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int counter = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'R'){
                balance++;
            }else {
                balance--;
            }
            if(balance == 0){
                counter++;
            }
        }
        return counter;
    }
}
