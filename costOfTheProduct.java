import java.util.*;
public class costOfTheProduct{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     float pencilCost = sc.nextFloat();
     float penCost = sc.nextFloat();
     float eraserCost = sc.nextFloat();
     float totalcost = pencilCost+eraserCost+penCost;
     double tax = totalcost*0.18;
     double finalCost= totalcost + tax;
     System.out.println("the total cost is : "+ totalcost);
     System.out.println("the total tax is : "+ tax);
     System.out.println("the final cost is : "+ finalCost);
   }

}
