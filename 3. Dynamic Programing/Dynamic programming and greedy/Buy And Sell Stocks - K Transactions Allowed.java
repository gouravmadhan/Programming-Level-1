// 1. You are given a number n, representing the number of days.
// 2. You are given n numbers, where ith number represents price of stock on ith day.
// 3. You are given a number k, representing the number of transactions allowed.
// 3. You are required to print the maximum profit you can make if you are allowed k transactions at-most.
// Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy).
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int dp[][] = new int[k+1][n];
        
        for(int t = 1;t<=k;t++){
            int max = Integer.MIN_VALUE;
            for(int d=1;d<n;d++){
                if(dp[t-1][d-1] - arr[d-1]>max ){
                  max =dp[t-1][d-1]-arr[d-1];  
                }
                if(max+arr[d]> dp[t][d-1]   ){
                    dp[t][d] = max +arr[d];
                }
                else{
                    dp[t][d] = dp[t][d-1];
                }
            }
        }
        System.out.println(dp[k][n-1]);
    }

}