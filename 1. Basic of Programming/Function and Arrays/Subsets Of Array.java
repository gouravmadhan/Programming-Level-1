// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to print all subsets of arr. Each subset should be
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
    
    String set = "";
    for(int i = 0 ;i < (int) Math.pow(2,n);i++){
        int temp = i;
        set="";
        for(int j=n-1;j>=0 ;j--){
            int d = temp%2;
            temp=temp/2;
            if(d==0)
                set  = "-\t" + set;
            else{
                set = arr[j] + "\t" + set ;
            }
            
        }
        System.out.println(set);
    }
 }

}