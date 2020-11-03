// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.

// Asssumption - Array is sorted. Array may have duplicate values.
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
    int val = scan.nextInt();
    
    int low = 0;
    int high = n-1;
    int fi=-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]<val){
            low=mid+1;
        }
        else if(arr[mid]>val){
            high=mid-1;
        }
        else{
            fi=mid;
            high=mid-1;
        }
    }
    System.out.println(fi);
    low=0;
    high = n-1;
    int li=-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]<val){
            low=mid+1;
        }
        else if(arr[mid]>val){
            high=mid-1;
        }
        else{
            li=mid;
            low=mid+1;
        }
    }
    System.out.println(li);
    
 }

}