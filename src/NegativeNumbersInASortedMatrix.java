import java.util.Arrays;

public class NegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int total = 0;
        for(int i = 0; i < grid.length; i++){
            total += countInARow(grid[i]);
        }
        return total;
    }

    public int countInARow(int[] row){
        int count = 0;
        int i = 0;
        Arrays.sort(row);
        while (i < row.length && row[i] < 0){
            count++;
            i++;
        }
        return count;
    }

/*    public int countNegatives(int[][] grid) {
        int counter = 0;
        for(int row = 0; row < grid.length; row++){
            for(int column = 0; column < grid[row].length; column++){
                if(grid[row][column] < 0){
                    counter++;
                }
            }
        }
        return counter;
    }*/
    /*
    class Solution {
        public int countNegatives(int[][] grid) {
            int res=0;
            for(int i=0;i<grid.length;i++){
                res+=pass(grid[i]);
            }
            return res;
         }

        public int pass(int[] grid) {
            int count=0;
            Arrays.sort(grid);
            int i=0;
            while(i<grid.length && grid[i]<0){
                count++;
                i++;
            }
            return count;
        }
    }*/
}
