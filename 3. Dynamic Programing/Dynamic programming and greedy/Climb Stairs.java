// 1. You are given a number n, representing the number of stairs in a staircase.
// 2. You are on the 0th step and are required to climb to the top.
// 3. In one move, you are allowed to climb 1, 2 or 3 stairs.
// 4. You are required to print the number of different paths via which you can climb to the top.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // int csp = getPathSum(n, new int[n+1]);
        int csp = getPathSumTab(n);
        System.out.println(csp);
    }
    public static int getPathSum(int n ,int[] arr){
        if(n==0)
            return 1;
        else if(n<0)
            return 0;
        if(arr[n]!=0)
            return arr[n];
        int a = getPathSum(n-1,arr);
        int b = getPathSum(n-2,arr);
        int c = getPathSum(n-3,arr);
        int result = a+b+c;
        return result;
        
    }
    public static int getPathSumTab(int n ){
        int arr[] = new int[n+1];
        arr[0] = 1;
        for(int i=1;i<=n;i++){
            if(i==1)
                arr[i] = arr[i-1];
            else if(i==2)
                arr[i] = arr[i-1]+arr[i-2];
            else
                arr[i] = arr[i-1] + arr[i-2] + arr[i-3] ;
        }
        // for(int i=0;i<=n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        return arr[n];
    }

}