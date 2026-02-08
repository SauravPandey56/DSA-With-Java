// find number of ways to reach from (0,0) to (n-1,m-1) in a N*M Grid
// ALLOWED MOVES :->  right or down
//by using MODULO(10^9+7) <-  Best for Competitive coding
//(O(n) Time, O(1) Space)
public class totalWaysGrid {

    static final long MOD = 1000000007;

    public static long gridWays(int n, int m) {

        int N = n + m - 2;
        int R = Math.min(n - 1, m - 1);

        long result = 1;

        for (int i = 1; i <= R; i++) {

            result = (result * (N - R + i)) % MOD;
            result = (result * modInverse(i, MOD)) % MOD;
        }

        return result;
    }

    // Fermat's Little Theorem
    static long modInverse(long a, long mod) {
        return power(a, mod - 2, mod);
    }

    static long power(long a, long b, long mod) {

        long res = 1;

        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % mod;

            a = (a * a) % mod;
            b >>= 1;
        }

        return res;
    }

    public static void main(String[] args) {

        int n = 100000, m = 100000;
        System.out.println(gridWays(n, m));
    }
}
