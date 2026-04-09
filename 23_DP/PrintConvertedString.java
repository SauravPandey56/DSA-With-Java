public class PrintConvertedString {

    public static void stringConversion(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];

        // build LCS table
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){

                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }

            }
        }

        // backtracking
        int i = n;
        int j = m;

        System.out.println("Operations:");

        while(i > 0 && j > 0){

            if(str1.charAt(i-1) == str2.charAt(j-1)){
                i--;
                j--;
            }

            else if(dp[i-1][j] > dp[i][j-1]){
                System.out.println("Delete: " + str1.charAt(i-1));
                i--;
            }

            else{
                System.out.println("Insert: " + str2.charAt(j-1));
                j--;
            }
        }

        // remaining characters
        while(i > 0){
            System.out.println("Delete: " + str1.charAt(i-1));
            i--;
        }

        while(j > 0){
            System.out.println("Insert: " + str2.charAt(j-1));
            j--;
        }
    }

    public static void main(String args[]){

        String str1 = "pear";
        String str2 = "sea";

        stringConversion(str1, str2);

    }
}