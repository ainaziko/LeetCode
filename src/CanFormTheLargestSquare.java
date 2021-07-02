public class CanFormTheLargestSquare {
    public int countGoodRectangles(int[][] rectangles) {
        int counter = 0;
        int max = 0;
        int[] container = new int[rectangles.length];
        int i = 0;
        for(int[] el : rectangles){
            container[i] = lower(el[0], el[1]);
            i++;
        }
        for(int num : container){
            if(num > max){
                max = num;
            }
        }
        for(int num : container){
            if(num == max){
                counter++;
            }
        }
        return counter;
    }

    public int lower(int i, int j){
       if(j <= i){
           return j;
       }else {
           return i;
       }
    }
}