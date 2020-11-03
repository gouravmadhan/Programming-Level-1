// 1. You are given a number n, representing the count of items.
// 2. You are given n numbers, representing the values of n items.
// 3. You are given n numbers, representing the weights of n items.
// 3. You are given a number "cap", which is the capacity of a bag you've.
// 4. You are required to calculate and print the maximum value that can be created in the bag without 
//     overflowing it's capacity.
// Note -> Each item can be taken any number of times. You are allowed to put the same item again 
//                   and again.
import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int val[] = new int[n];
	        int weit[] = new int[n];
	        for(int i = 0 ; i < n;i++)
	            val[i] = scan.nextInt();
	        for(int i=0;i<n;i++)
	            weit[i] = scan.nextInt();
	        int tar = scan.nextInt();
	        
	        int dp[] = new int[tar+1];
	        dp[0] = 0;
	        for(int i = 1 ;i<dp.length;i++){
	            int max = 0;
	            for(int j = 0 ; j<n;j++){
	                if(weit[j]<=i){
	                    int a = val[j];
	                    int b = dp[i-weit[j]];
	                    int total = a+b;
	                    if(total>max)
	                        max= total;
	                }
	                
	            }
	            dp[i] = max;
	        }
	        System.out.println(dp[tar]);

	    }
	}