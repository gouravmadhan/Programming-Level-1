// 1. You are given a number n, representing the number of days.
// 2. You are given n numbers, where ith number represents price of stock on ith day.
// 3. You are required to print the maximum profit you can make if you are allowed a single transaction.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i =0 ;i<n;i++)
            arr[i] = scan.nextInt();
        int least = Integer.MAX_VALUE;
        int  op = 0;
        int pist = 0;
        for(int i=0;i<n;i++){
            if(least>arr[i])
                least =arr[i];
            pist = arr[i] - least;
            if(op<pist)
                op = pist;
        }
        System.out.println(op);
    }

}