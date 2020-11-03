// 1. You are given a number n, representing the number of days.
// 2. You are given n numbers, where ith number represents price of stock on ith day.
// 3. You are required to print the maximum profit you can make if you are allowed infinite transactions.
// Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy)
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int  n = scan.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scan.nextInt();
        int profit =0;
        int buy=0;
        int sell=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1])
                sell++;
            else{
                profit +=arr[sell]-arr[buy];
                buy=sell=i;
            }
        }
        profit +=arr[sell]-arr[buy];
        System.out.println(profit);
    }

}