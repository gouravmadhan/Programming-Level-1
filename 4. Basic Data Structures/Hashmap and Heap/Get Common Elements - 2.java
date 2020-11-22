// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. You are required to find the intersection of a1 and a2. To get an idea check the example below:
 
// if a1 -> 1 1 2 2 2 3 5
// and a2 -> 1 1 1 2 2 4 5
// intersection is -> 1 1 2 2 5
import java.io.*;
import java.net.Inet4Address;
import java.util.*;

import javax.print.attribute.HashAttributeSet;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int arr1[] = new int[n1];
        for(int i = 0 ; i < n1 ;i++){
            arr1[i] = scan.nextInt();
        }
        int n2 = scan.nextInt();
        int arr2[] = new int[n2];
        for(int i = 0 ; i < n2 ;i++){
            arr2[i] = scan.nextInt();
        }
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int val : arr1){
            if(map.get(val)!=null){
                map.put(val, map.get(val)+1);
            }else{
                map.put(val, 1);
            }
        }
        for(int val : arr2){
            if(map.get(val)!=null && map.get(val)>0){
                System.out.println(val);
                map.put(val, map.get(val)-1);
            }else{
                map.remove(val);
            }
        }
    }

}