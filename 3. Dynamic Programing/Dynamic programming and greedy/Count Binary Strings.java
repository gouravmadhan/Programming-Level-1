// 1. You are given a number n.
// 2. You are required to print the number of binary strings of length n with no consecutive 0's.
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int dp0[] = new int[n+1];
    int dp1[] = new int[n+1];
    dp0[1] = 1;
    dp1[1] = 1;
    for(int i=2;i<=n;i++){
        dp0[i] = dp1[i-1];
        dp1[i] = dp1[i-1] + dp0[i-1];
    }
    System.out.println(dp0[n]+dp1[n]);
 }

}