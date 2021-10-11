package neocoder.week4;

public class Sqrt {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }else if(x == 1){
            return 1;
        }
        int l = 2;
        int r = x;
        while (l <= r){
            int mid = l + (r - l)/2;
            if(mid <= x/mid){
                l = mid + 1;
            }else if(mid == x/mid){
                return mid;
            }else {
                r = mid - 1;
            }
        }
        return r;
    }
}
