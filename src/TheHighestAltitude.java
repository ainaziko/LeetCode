public class TheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int curr = 0;
        int max = 0;
        for(int g : gain){
            curr += g;
            if(curr > max){
                max = curr;
            }
        }
        return max;
    }
}
