// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print a bar chart representing value of arr a.
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i]= scan.nextInt();
    }
    int max=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>max)
            max=arr[i];
    }
    int temp=max;
    for(int i=0;i<temp;i++){
        for(int j=0;j<n;j++){
            if(arr[j]>=max){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        max--;
        System.out.println();
    }
 }

}