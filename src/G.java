import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class G {
    public static void main(String[] args) throws Exception {
        calc();
    }

    private static void calc() throws Exception {
        Scanner in = new Scanner(System.in);
        double n = in.nextInt();
        double m = in.nextInt();

        String input = Double.toString(- (m*n)/(n - m));
        int[] result = convertToFraction(input);
        System.out.println(result[0] + "/" + result[1]);

    }

    static int[] convertToFraction(String numberStr) throws Exception {
        String[] parts = null;
        try {
            BigDecimal number = new BigDecimal(numberStr);
            parts = number.toString().split("\\.");
            if (parts.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Error: Please ensure that"+
                        " the entered value has a decimal.");
            }
        } catch (NumberFormatException e) {
            throw new Exception(
                    "Error: Please enter the number in proper format.");
        } catch (ArrayIndexOutOfBoundsException ae){
            throw ae;
        }

        BigDecimal den = BigDecimal.TEN.pow(parts[1].length());
        BigDecimal num = (new BigDecimal(parts[0]).multiply(den))
                .add(new BigDecimal(parts[1]));
        return reduceFraction(num.intValue(), den.intValue());
    }
    static int[] reduceFraction(int num, int den) {
        int gcd = BigInteger.valueOf(num).gcd(BigInteger.valueOf(den))
                .intValue();
        int[] fractionElements = { num / gcd, den / gcd };
        return fractionElements;
    }
}

