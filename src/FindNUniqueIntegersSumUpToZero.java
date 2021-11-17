import java.util.HashMap;

public class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int count = 0;
        for(int i = 0; i < n -1; i++){
            ans[i] = i + 1;
            count += i + 1;
        }
        ans[n - 1] = - count;
        return ans;
    }
}
