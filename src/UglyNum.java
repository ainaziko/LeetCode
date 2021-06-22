import java.util.ArrayList;
import java.util.Collections;

public class UglyNum {
    //time limit exceeded
    public boolean isUgly(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 2;
        while (n != 1){
            if(n % i == 0){
                arr.add(i);
                n = n / i;
            }
            else{
                i++;
            }
        }
        boolean b = true;
        Collections.sort(arr);
        for(int curr : arr){
            if(curr > 5){
                b = false;
                break;
            }
        }
        return b;
    }
}
