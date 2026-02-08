// find number of ways to reach from (0,0) to (n-1,m-1) in a N*M Grid
// ALLOWED MOVES :->  right or down
//by using BigInteger <-  Best for Need exact answer
//(O(n) Time, O(1) Space)
import java.math.BigInteger;

public class totalWaysGrid {

    public static BigInteger gridWays(int n, int m) {

        int N = n + m - 2;
        int R = Math.min(n - 1, m - 1);

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= R; i++) {
            result = result.multiply(BigInteger.valueOf(N - R + i))
                           .divide(BigInteger.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 50, m = 50;   // Large input
        System.out.println(gridWays(n, m));
    }
}

