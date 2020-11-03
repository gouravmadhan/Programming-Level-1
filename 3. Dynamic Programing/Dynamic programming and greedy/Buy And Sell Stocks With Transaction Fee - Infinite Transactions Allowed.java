// 1. You are given a number n, representing the number of days.
// 2. You are given n numbers, where ith number represents price of stock on ith day.
// 3. You are give a number fee, representing the transaction fee for every transaction.
// 4. You are required to print the maximum profit you can make if you are allowed infinite transactions, but has to pay "fee" for every closed transaction.
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
        int fee = scan.nextInt();
        int obsp = -arr[0];
        int ossp = 0;
        for(int i = 1;i<n;i++){
            int nbsp = 0;
            int nssp = 0;
            if(ossp - arr[i] > obsp){
                nbsp = ossp - arr[i];
            }
            else{
                nbsp = obsp;
            }
            if(obsp + arr[i]- fee > ossp){
                nssp = obsp +arr[i] - fee;
            }
            else{
                nssp = ossp;
            }
            ossp = nssp;
            obsp = nbsp;
        }
        System.out.println(ossp);
    }

}