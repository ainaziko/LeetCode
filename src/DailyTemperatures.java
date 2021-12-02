import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {

    public int[] dailyTemperaturesQ(int[] temperatures) {
        int len = temperatures.length;
        int[] ans = new int[len];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int currDay = 0; currDay < len; currDay++){
            int currTemp = temperatures[currDay];

            while (!stack.isEmpty() && temperatures[stack.peek()] < currTemp){
                int prevDay = stack.pop();
                ans[prevDay] = currDay - prevDay;
            }
            stack.push(currDay);
        }
        return ans;
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] ans = new int[len];

        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                if(temperatures[i] < temperatures[j]) {
                    ans[i] = j - i;
                    break;
                }
            }
        }
        return ans;
    }
}
