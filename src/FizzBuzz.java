import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>();
        HashMap<Integer, String> dict =
                new HashMap<Integer, String>(){
                    {
                        put(3, "Fizz");
                        put(5, "Buzz");
                    }
        };

        for(int i = 1; i <= n; i++){
            String str_answer = "";
            for(Integer key : dict.keySet()){
                if(i % key == 0){
                    str_answer += dict.get(key);
                }
            }
            if(str_answer.equals("")){
                str_answer += i + "";
            }
            answer.add(str_answer);
        }
        return answer;
    }
}
