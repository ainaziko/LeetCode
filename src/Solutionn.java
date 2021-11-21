import java.util.ArrayList;
import java.util.List;

public class Solutionn {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int item = 1;

        for(int i = 0; i < target.length;){
            if(item == target[i]){
                ans.add("Push");
                i++;
            }else {
                ans.add("Push");
                ans.add("Pop");
            }
            item++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solutionn b = new Solutionn();
        int[] target = {1,2};
        int n = 4;
        System.out.println(b.buildArray(target, n));
    }
}
