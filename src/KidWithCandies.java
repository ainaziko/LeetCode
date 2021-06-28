import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] list = new boolean[candies.length];
        Arrays.fill(list, true);
        for(int kid = 0; kid < candies.length; kid++){
            int max = candies[kid] + extraCandies;
            for(int otherKid = 0; otherKid < candies.length; otherKid++){
                if(candies[otherKid] > max){
                    list[kid] = false;
                    break;
                }
            }
        }
        List<Boolean> ans = new ArrayList<Boolean>();
        for(boolean el : list){
            ans.add(el);
        }
        return ans;
    }
}
