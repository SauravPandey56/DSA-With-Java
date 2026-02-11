//find if any pair in a sorted Arraylist has a target sum .
// list = [1,2,3,4,5,6,7] target = 5
// optimized approach -->> 2 pointer approach
import java.util.ArrayList;
public class optimizedSumOfPair1 {
    public static boolean pairSum1(ArrayList<Integer>list,int target){
        int lp = 0;
        int rp= list.size()-1;
        while(lp!=rp){
            // case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            // case 2
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                //case 3
                rp --;
            }
        }
        return false;
    }
    public static void main(String args[]){
    ArrayList<Integer>list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    int target = 5;
    System.out.println(pairSum1(list,target));
  }
}
