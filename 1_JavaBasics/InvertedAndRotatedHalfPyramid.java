public class InvertedAndRotatedHalfPyramid {
    public static void I_R_H_P(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<= n-i; j++){       // space
                System.out.print(" ");
            }
            for(int j = 1; j<= i;j++){
                System.out.print("*");            // star       
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        I_R_H_P(4);
    }
}
