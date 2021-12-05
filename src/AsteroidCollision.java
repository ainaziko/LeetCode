import java.util.ArrayList;
import java.util.Stack;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        for (int ast: asteroids) {
            collision:{
                while (!stack.isEmpty() && ast < 0 && stack.peek() > 0){
                    if(stack.peek() < -ast){
                        stack.pop();
                        continue;
                    }else if(stack.peek() == - ast){
                        stack.pop();
                    }
                    break collision;
                }
                stack.push(ast);
            }
        }
        int[] ans = new int[stack.size()];
        for(int i = stack.size() - 1; i >= 0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
    public int[] asteroidCollisionM(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < asteroids.length; i++){
            int curr = asteroids[i];
            if(!stack.isEmpty()){
                int peek = stack.peek();
                if(peek > 0 && curr < 0){
                    if(Math.abs(peek) == Math.abs(curr)){
                        stack.pop();
                    }else if(Math.abs(peek) < Math.abs(curr)){
                        stack.pop();
                    }
                }else {
                    stack.push(curr);
                }
            }else {
                stack.push(curr);
            }
        }
        System.out.println(stack);
        int[] ans = new int[stack.size()];

        for(int i = stack.size() - 1; i >= 0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {10,2,-5};
        AsteroidCollision a = new AsteroidCollision();
        a.asteroidCollision(n);
    }

}
