public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = {10,11,12};
        SumOfAllOddLengthSubarrays s = new SumOfAllOddLengthSubarrays();
        //System.out.println(s.sumOfSubArr(0,0, arr));
        System.out.println(s.sumOddLengthSubarrays(arr));;
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int counter = 0;
        for(int i = 0; i < arr.length; i += 2){
            for(int j = 0; i + j < arr.length; j++){
                counter += sumOfSubArr(j, j + i, arr);
            }
        }
        return counter;
    }

    public static int sumOfSubArr(int startAt, int stopAt, int[] arr){
        int counter = 0;
        for(int i = startAt; i <= stopAt; i++){
            counter += arr[i];
        }
        return counter;
    }

    //TODO понять это
    public int sumOddLengthSubarraysOne(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            int totalSubArrays = (n-i) * (i+1);
            int totalOddSubArrays = totalSubArrays - (totalSubArrays/2);
            sum = sum + (arr[i] * totalOddSubArrays);
        }

        return sum;
    }
    //https://leetcode.com/problems/sum-of-all-odd-length-subarrays/discuss/1325203/100-faster-Java-with-explanation
}
