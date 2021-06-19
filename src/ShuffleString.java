import java.util.HashMap;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        for(int i = 0; i < indices.length; i++){
            map.put(indices[i], s.charAt(i));
        }
        map.entrySet().forEach(x -> sb.append(x.getValue()));
        return sb.toString();
    }
    /*
    char[] str = s.toCharArray();
    for (int i = 0 ; i < indices.length ; i++)
        str[indices[i]] = s.charAt(i);
    System.out.println(String.valueOf(str));
    */
}
