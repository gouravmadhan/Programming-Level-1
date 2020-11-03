// 1. You are given a number n, representing the number of days.
// 2. You are given n numbers, where ith number represents price of stock on ith day.
// 3. You are required to print the maximum profit you can make if you are allowed two transactions at-most.
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
        
        int mpist = 0;
        int leastsf = arr[0];
        int dpr[] = new int[n];
        for(int i = 1; i < n;i++){
            if(leastsf>arr[i]){
                leastsf = arr[i];
            }
            mpist = arr[i] - leastsf;
            if(mpist > dpr[i-1]){
                dpr[i] = mpist;
            }
            else{
                dpr[i] = dpr[i-1];
            }
        }
        int mpibt = 0;
        int mat = arr[n-1];
        int dpl[] = new int[n];
        for(int i = n-2 ; i>=0;i--){
            if(arr[i]>mat){
                mat = arr[i];
            }
            mpibt = mat - arr[i];
            if(mpibt > dpl[i+1]){
                dpl[i] = mpibt;
            }
            else{
                dpl[i] = dpl[i+1];
            }
        }
        int op =0 ;
        for(int i =0;i<n;i++){
            if(dpr[i]+dpl[i] >op)
                op = dpr[i] + dpl[i];
        }
        System.out.println(op);
    }

}