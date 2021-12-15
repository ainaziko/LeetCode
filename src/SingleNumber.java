public class SingleNumber {
    public int singleNumber(int[] nums) {
        int a = 0;

        for(int n : nums){
            a ^= n;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        SingleNumber s = new SingleNumber();
        System.out.println(" " + (4^1));
        s.singleNumber(arr);
    }
}
