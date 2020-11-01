// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to add the numbers represented by two arrays and print the
// arrays.
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n1 =scan.nextInt();
    int arr[] = new int[n1];
    for(int i=0;i<n1;i++){
        arr[i] = scan.nextInt();
    }
    int n2 = scan.nextInt();
    int arr2[] = new int[n2];
    for(int i=0;i<n2;i++){
        arr2[i] = scan.nextInt();
    }
    int result[] = new int[n1>n2?n1:n2];
    int c=0;
    int i = n1-1;
    int j = n2-1;
    int  k = result.length-1;
    while(k>=0){
        int d = c;
        if(i>=0){
            d += arr[i];
        }
        if(j>=0){
            d+=arr2[j];
        }
        c = d/10;
        d = d%10;
        result[k] = d;
        i--;
        j--;
        k--;
        
    }
    if(c!=0){
        System.out.println(c);
    }
    for(i=0;i<result.length;i++){
        System.out.println(result[i]);
    }
    
    
 }

}