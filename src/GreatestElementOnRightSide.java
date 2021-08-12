public class GreatestElementOnRightSide {
    public static void main(String[] args) {
        GreatestElementOnRightSide g = new GreatestElementOnRightSide();
        int[] arr = {400};
        g.replaceElements(arr);
    }

    public int[] replaceElements(int[] arr) {
        GreatestElementOnRightSide g = new GreatestElementOnRightSide();
        int [] ans = new int[arr.length];
        for(int i = 0; i < ans.length; i++){
            ans[i] = g.findGreater(arr, i);
        }
        for(int num : ans){
            System.out.println(num);
        }
        return ans;
    }

    public int findGreater(int[] arr, int startIndex){
        int max = 0;
        if(startIndex == arr.length - 1) return -1;
        for(int i = startIndex + 1; i < arr.length; i++){
            int curr = arr[i];
            if(max < curr){
                max = curr;
            }
        }
        return max;
    }
    /*
    * class Solution {
    public int[] replaceElements(int[] arr) {
      int [] aux = new int[arr.length];

     int max = -1;

    for (int i = arr.length-1; i>=0; i--){
        aux[i] = max;
        if (arr[i]>max)max=arr[i];
    }

        return aux;
    }
}*/
}
