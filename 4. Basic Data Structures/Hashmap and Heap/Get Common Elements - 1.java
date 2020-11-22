// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. You are required to print all elements of a2 which are also present in a1 (in order of their occurence in a2). Make sure to not print duplicates (a2 may have same value present many times).
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
            map.put(val, 1);
        }
        for(int val : arr2){
            if(map.containsKey(val)){
                System.out.println(val);
                map.remove(val);
            }
        }
    }

}