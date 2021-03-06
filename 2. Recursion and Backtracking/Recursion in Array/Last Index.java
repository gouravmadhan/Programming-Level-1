// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number x. 
// 4. You are required to find the last index at which x occurs in array a.
// 5. If x exists in array, print the last index where it is found otherwise print -1.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] =  new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
            
        }
        int find = scan.nextInt();
        System.out.println(lastIndex(arr,0,find));
    }

    public static int lastIndex(int[] arr, int index, int x){
        if(index==arr.length)
            return -1;
        int m = lastIndex(arr,index+1,x);
        if(m==-1)
        {
            if(arr[index]==x)
                return index;
            else 
                return -1;
        }
        else
            return m;
    }

}