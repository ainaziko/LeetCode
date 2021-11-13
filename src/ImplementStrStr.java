public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if(needle.equals("") || haystack.equals("")) return 0;
        if(!haystack.contains(needle)){
            return -1;
        }
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        ImplementStrStr i = new ImplementStrStr();
        i.strStr("hello", "ll");
    }
}
