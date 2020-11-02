// 1. You are given an array(arr) of integers.
// 2. You have to sort the given array in increasing order using count sort.
import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
   int n = max-min+1;
   int freq[] = new int[n];
   for(int i=0;i<arr.length;i++){
       int idx = arr[i]-min;
       freq[idx]++;
   }
   for(int i=1;i<freq.length;i++){
       freq[i]=freq[i]+freq[i-1];
   }
   int ans[] = new int[arr.length];
   for(int i=arr.length-1;i>=0;i--){
       int val = arr[i];
       int index = freq[val-min];
       ans[index-1]= val;
       freq[val-min]--;
   }
   for(int i =0;i<ans.length;i++){
       arr[i]=ans[i];
   }
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}