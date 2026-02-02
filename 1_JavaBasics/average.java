import java.util.*;
public class average {
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the frist number");
    int a = sc.nextInt();
    System.out.println("enter the second number");
    int b = sc.nextInt();
    System.out.println("enter the third number");
    int c = sc.nextInt();
    //
    int average = (a+b+c)/3;
    System.out.println("average is"+""+average);

   }
}
