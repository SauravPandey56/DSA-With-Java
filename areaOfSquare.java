import java.util.*;
public class areaOfSquare {
   public static void main(String args[]){
    Scanner sc =  new Scanner(System.in);
    System.out.println("enter the side of square");
    int side = sc.nextInt();
    int square = (int)Math.pow(side,2);
    System.out.println("the Square of the number is : "+square);
   } 
}
