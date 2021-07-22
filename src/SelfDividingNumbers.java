import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        SelfDividingNumbers s = new SelfDividingNumbers();
        System.out.println(s.selfDividingNumbers(47,85));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isDivisible(i)){
                list.add(i);
            }
        }
        return list;
    }

    public boolean isDivisible(int num){
        String sNum = Integer.toString(num);
        for(char strDigit : sNum.toCharArray()){
            int digit = Integer.parseInt(strDigit + "");
            if(digit == 0 || num % digit != 0) return false;
        }
        return true;
    }
}