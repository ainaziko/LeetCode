import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int counter = 0;
        int[] arr = new int[heights.length];
        for(int j = 0; j < heights.length; j++){
            arr[j] = heights[j];
        }
        Arrays.sort(heights);

        for(int i = 0; i < heights.length; i++){
            if(heights[i] != arr[i]){
                counter++;
            }
        }
        return counter;
    }
}
