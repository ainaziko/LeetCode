public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] str = s.toCharArray();
        for (int i = 0 ; i < indices.length ; i++)
            str[indices[i]] = s.charAt(i);
        return String.valueOf(str);
    }

    /*
    char[] str = s.toCharArray();
    for (int i = 0 ; i < indices.length ; i++)
        str[indices[i]] = s.charAt(i);
    System.out.println(String.valueOf(str));
    */
}
