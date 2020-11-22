// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print the longest sequence of consecutive elements in the array (ignoring duplicates).

// Note -> In case there are two sequences of equal length (and they are also the longest), then print the one for which the starting point of which occurs first in the array.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sscan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = scan.nextInt();
        }
        HashMap <Integer,Boolean> map = new HashMap<>();
        for(int val : arr){
            map.put(val, true);
        }
        for(int val : arr){
            if(map.containsKey(val-1)){
                map.put(val, false);
            }
        }
        int msp = 0;
        int ml = 0;
        for(int val : arr){
            if(map.get(val)==true){
                int tl = 1;
                int tsp = val;
                while(map.containsKey(tsp + tl)){
                    tl++;
                }
                if(tl > ml){
                    ml = tl;
                    msp = val;
                }
            }
        }
        for(int i = 0 ;i < ml ;i++){
            System.out.println(msp + i);
        }
    }

}