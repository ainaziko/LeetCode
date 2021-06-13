public class IsCovered {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean ans = true;
        for(int i = left; i <= right; i++){
            boolean ch = check(ranges, i);
            if(!ch){ ans = false; }
        }
        return ans;
    }

    public boolean check(int[][] ranges, int num){
        boolean covers = false;
        for(int[] curr : ranges){
            if((curr[0] <= num && num <= curr[1])){
                covers = true;
                break;
            }
        }
        return covers;
    }
}
