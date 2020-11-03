// 1. You are given a number n, representing the number of days.
// 2. You are given n numbers, where ith number represents price of stock on ith day.
// 3. You are required to print the maximum profit you can make if you are allowed infinite transactions, but have to cooldown for 1 day after 1 transaction
// i.e. you cannot buy on the next day after you sell, you have to cooldown for a day at-least before buying again.
// Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy).
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scan.nextInt();
        int obsp = -arr[0];
        int ossp = 0;
        int ocsp = 0;
        for(int i = 1;i < n ;i++){
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;
            if(ocsp - arr[i] > obsp){
                nbsp = ocsp - arr[i];
            }else{
                nbsp = obsp;
            }
            
            if(obsp + arr[i] >ossp){
                nssp = obsp + arr[i];
            }else{
                nssp = ossp;
            }
            
            if(ossp>ocsp){
                ncsp = ossp;
            }else{
                ncsp = ocsp;
            }
            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
        System.out.println(ossp);
        
    }

}