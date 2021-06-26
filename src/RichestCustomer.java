public class RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
            int counter = 0;
            for(int j = 0; j < accounts[i].length; j++){
                counter += accounts[i][j];
            }
            if(counter >= max) max = counter;
        }
        return max;
    }
}
