public class ProductAndSumOfDigits {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int num = n;
        while(n != 0){
            System.out.println(n % 10);
            product *= n % 10;
            n = n / 10;
        }
        while (num != 0){
            sum += num % 10;
            num = num / 10;
        }
        return product - sum;
    }
}
