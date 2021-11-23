import java.util.ArrayList;
import java.util.Arrays;

public class MyHashMapD {
    private final int MAX_SIZE = 1_000_000;
    private int[] data;

    public MyHashMapD() {
        this.data =  new int[MAX_SIZE + 1];
        Arrays.fill(data, -1);
    }

    public void put(int key, int value) {
        data[key] = value;
    }

    public int get(int key) {
        return data[key];
    }

    public void remove(int key) {
        data[key] = -1;
    }
}
