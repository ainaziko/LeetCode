import java.util.Deque;
import java.util.LinkedList;

public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        int N = deck.length;
        Deque<Integer> index = new LinkedList<>();

        for(int i = 0; i < N; ++i){
            index.add(i);
        }
        int[] ans = new int[N];
        for(int card : deck){
            ans[index.pollFirst()] = card;
            if(!index.isEmpty()){
                index.add(index.pollFirst());
            }
        }
        return ans;
    }
}
