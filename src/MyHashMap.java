import java.util.ArrayList;

class MyHashMap {
    ArrayList<Integer> k;
    ArrayList<Integer> v;

    public MyHashMap() {
        this.k = new ArrayList<>();
        this.v = new ArrayList<>();
    }

    public void put(int key, int value) {
        if(!k.contains(key)){
            k.add(key);
            v.add(value);
        }else {
            for(int i = 0; i < k.size(); i++){
                if(k.get(i) == key){
                    v.set(i, value);
                }
            }
        }

    }

    public int get(int key) {
        if(k.contains(key)){
            for(int i = 0; i < k.size(); i++){
                if(k.get(i) == key){
                    return v.get(i);
                }
            }
        }
        return -1;
    }

    public void remove(int key) {
        if(k.contains(key)){
            for(int i = 0; i < k.size(); i++){
                if(k.get(i) == key){
                    k.remove(i);
                    v.remove(i);
                }
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */