// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to print all sub arrays of arr. Each sub array should be
// on separate line. For more clarity check out sample input and output.


import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n =scan.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
        arr[i] = scan.nextInt();
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]+"\t");
            }
            System.out.println();
        }
    }
 }

}