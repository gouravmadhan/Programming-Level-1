// 1. You are given a number n.
// 2. You are required to print the nth element of fibonnaci sequence.

// Note -> Notice precisely how we have defined the fibonnaci sequence
// 0th element -> 0
// 1st element -> 1
// 2nd element -> 1
// 3rd element -> 2
// 4th element -> 3
// 5th element -> 5
// 6th element -> 8
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n+1];
    System.out.println(findFibo(n,arr));
 }
 public static int findFibo(int n , int[] arr){
     if(n==0||n==1)
        return n;
    if(arr[n]!=0){
        return arr[n];
    }
    int f1 = findFibo(n-1,arr);
    int f2 = findFibo(n-2,arr);
    int fibo = f1 + f2 ;
    arr[n] = fibo;
    return fibo;
 }

}