// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

// Assumption - number represented by a2 is greater.
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
    int result[] = new int[n2];
    int c=0;
    int i = n1-1;
    int j = n2-1;
    int  k = result.length-1;
    while(k>=0){
        int d=0;
        int a1v = i>=0?arr[i]:0;
        if(arr2[j]+c >=a1v){
            d=arr2[j] + c - a1v;
            c=0;
        }
        else{
            d=arr2[j] + c +10 -a1v;
            c=-1;
        }
        result[k]=d;
        i--;
        j--;
        k--;
    }
     i=0;
    while(result[i]==0)
        i++;
    for( k=i;k<n2;k++){
        System.out.println(result[k]);
    }
 }

}