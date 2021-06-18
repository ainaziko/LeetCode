public class Equivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String el : word1){
            sb1.append(el);
        }
        for(String el : word2){
            sb2.append(el);
        }
        if(sb1.toString().equals(sb2.toString())) return true;
        else return false;
    }
}
