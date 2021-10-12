package neocoder.week4;

import java.util.ArrayList;

public class SearchIn2DArr {
    public static void main(String[] args) {
        SearchIn2DArr s = new SearchIn2DArr();
        int[][] arr = {{1,3}};
        int target = 3;
        System.out.println(s.searchMatrix(arr, target));

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;

        while (i<matrix.length && j>=0){
            if(matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] > target){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }
/*    public boolean searchMatrix(int[][] matrix, int target) {
       if(matrix.length == 0){
           return false;
       }
       int rowLen = matrix.length - 1;
       int colLen = matrix[rowLen].length;

       int l = 0;
       int r = rowLen * colLen;

       while (l <= r){
           int mid = (l + r)/2;
           if(matrix[mid/colLen][mid%colLen] == target){
               return true;
           }else if(matrix[mid/colLen][mid%colLen] < target){
               l = mid + 1;
           }else {
               r = mid - 1;
           }
       }
       return false;
    }*/


    /*   public boolean searchMatrix(int[][] matrix, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean ans = false;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                arr.add(matrix[i][j]);
            }
        }
        return binarySearch(arr, target);
    }*/

/*    public boolean binarySearch(ArrayList<Integer> arr, int target){
        int l = 0;
        int r = arr.size();
        while (l <= r){
            int mid = l + (r-l)/2;
            if(arr.get(mid) == target){
                return true;
            }else if(mid > target){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return false;
    }*/
}
