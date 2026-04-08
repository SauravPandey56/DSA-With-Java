public class StringConversion {

      // LCS Function
    public static int lcs( String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][]= new int [n+1][m+1];
        int ans = 0 ;
        // initilize 
        for (int i = 0 ; i<n+1 ; i++){
            for(int j = 0 ; j<m+1; j++){
               if(i==0||j==0){
                dp[i][j]=0;
               } 
            }
        }
        

        // bottom- up (Small to larger )

         for (int i = 1 ; i< n+1; i++){
            for(int j= 1; j<m+1; j++){
                if(str1.charAt(i-1)== str2.charAt(j-1)){
                    dp[i][j]= dp [i-1][j-1]+1;
                    
                }else{
                    int ans1 =dp[i-1][j];
                    int ans2 =dp[i][j-1];
                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
         }
         return dp[n][m];

    }
        //stringConversion

     public static void stringConversion(String str1, String str2){
        int lcsLength = lcs(str1, str2);

        int deletions = str1.length() - lcsLength;
        int insertions = str2.length() - lcsLength;

        System.out.println("LCS Length = " + lcsLength);
        System.out.println("Deletions required = " + deletions);
        System.out.println("Insertions required = " + insertions);
    }
    public static void main(String args[]){
        String str1 = "pear";
        String str2 = "sea";
       stringConversion(str1, str2);
    }
}
