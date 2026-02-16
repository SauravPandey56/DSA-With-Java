// find binomil coefficient :- ncr=n!/r!(n-r)!
import java.util.*;
public class binomialCofficient {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*1;
        }
        return f;
    }
    public static int binCoff(int n,int r){
        int fact_n =factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int binCoff=fact_n/(fact_r*fact_nmr);
    }
    public static void main(String args[]){
        System.out.println(binCoff(5,2));
    }
}
