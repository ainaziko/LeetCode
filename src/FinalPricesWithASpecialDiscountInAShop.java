import java.util.ArrayDeque;
import java.util.Arrays;

public class FinalPricesWithASpecialDiscountInAShop {

    public int[] finalPrices(int[] prices) {
        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                if(prices[i] >= prices[j]){
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }

    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        FinalPricesWithASpecialDiscountInAShop f = new FinalPricesWithASpecialDiscountInAShop();
        f.finalPrices(prices);
    }


    //If modifying the input is not allowed
    public int[] finalPricesD(int[] prices) {
        var finalPrices = Arrays.copyOf(prices, prices.length);
        var stack = new ArrayDeque<Integer>();

        for (var i = 0; i < finalPrices.length; i++) {
            while (!stack.isEmpty() && finalPrices[i] <= finalPrices[stack.peek()])
                finalPrices[stack.peek()] = finalPrices[stack.pop()] - finalPrices[i];
            stack.push(i);
        }
        return finalPrices;
    }

    //If modifying the input is allowed
    public int[] finalPricesD1(int[] prices) {
        var stack = new ArrayDeque<Integer>();

        for (var i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] <= prices[stack.peek()])
                prices[stack.peek()] = prices[stack.pop()] - prices[i];
            stack.push(i);
        }
        return prices;
    }

}
