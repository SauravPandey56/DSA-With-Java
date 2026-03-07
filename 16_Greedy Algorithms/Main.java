//D. Three Activities

import java.util.*;

public class Main {

    static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            Pair[] a = new Pair[n];
            Pair[] b = new Pair[n];
            Pair[] c = new Pair[n];

            for (int i = 0; i < n; i++) {
                a[i] = new Pair(sc.nextInt(), i);
            }

            for (int i = 0; i < n; i++) {
                b[i] = new Pair(sc.nextInt(), i);
            }

            for (int i = 0; i < n; i++) {
                c[i] = new Pair(sc.nextInt(), i);
            }

            Arrays.sort(a, (x, y) -> y.value - x.value);
            Arrays.sort(b, (x, y) -> y.value - x.value);
            Arrays.sort(c, (x, y) -> y.value - x.value);

            long ans = 0;

            for (int i = 0; i < 3 && i < n; i++) {
                for (int j = 0; j < 3 && j < n; j++) {
                    for (int k = 0; k < 3 && k < n; k++) {

                        int x = a[i].index;
                        int y = b[j].index;
                        int z = c[k].index;

                        if (x != y && y != z && x != z) {
                            long sum = (long) a[i].value + b[j].value + c[k].value;
                            ans = Math.max(ans, sum);
                        }
                    }
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}