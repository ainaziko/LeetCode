import java.util.LinkedList;

public class RecentCounterS {
    LinkedList<Integer> slideWindow;
    public RecentCounterS() {
        this.slideWindow = new LinkedList<>();
    }

    public int ping(int t) {
        this.slideWindow.addLast(t);

        while (this.slideWindow.getFirst() < t - 3000){
            this.slideWindow.removeFirst();
        }
        return slideWindow.size();
    }
}
