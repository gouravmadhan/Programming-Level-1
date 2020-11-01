// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are given another number d.
// 4. You are required find the ceil and floor of d in the array a.

// Ceil is defined as value in array which is just greater than d. If an element equal to d exists that will be considered as ceil.
// Floor is defined as value in array which is just lesser than d. If an element equal to d exists that will be considered as floor.
// Asssumption - Array is sorted.
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
    int low=0,high=n-1,ciel=0,floor=0;
    while(low<=high){
        int mid = (low+high)/2;
        if(val<arr[mid]){
            high= mid-1;
            ciel = arr[mid];
        }
        else if(val>arr[mid]){
            low = mid+1;
            floor = arr[mid];
        }
        else{
            floor = ciel =arr[mid];
            break;
        }
    }
    System.out.println(ciel);
    System.out.println(floor);
    
 }

}