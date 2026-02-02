import java.util.*;
public class tmperature {
    public static void main(String args[]){
    double temp = 103.5;
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the temperature : ");
    double temprature = sc.nextDouble();
    if(temprature >= temp){
        System.out.print("you have fever ");
    }
    else{
       System.out.print("you are not suffering from fever "); 
    }
    }
    
}
