import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    private int top;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        top = x;
        q1.add(x);
    }

    public int pop() {
        while (q1.size() != 1){
            int x = q1.remove();
            top = x;
            q2.add(x);
        }
        int ans = q1.remove();
        Queue<Integer> tmp = q1;
        q1 = q2;
        q2 = tmp;
        return ans;
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
