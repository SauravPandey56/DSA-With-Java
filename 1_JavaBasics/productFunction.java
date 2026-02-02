import java.util.*;
public class productFunction {
    public static int multiply(int a , int b){
        int product = a * b;
        return product;
    }
    public static void main(String args[]){
     int a = 5;
     int b = 7;
     multiply(a,b);//
     int prod = multiply(a,b);
     System.out.println("a*b = "+ prod);
     prod = multiply(10,10);
    System.out.println("a*b = "+ prod);

    }
}
