// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to display the contents of 2d array as suggested by output format below.
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int rows =scan.nextInt();
    int cols = scan.nextInt();
    int arr[] = new int[rows*cols];
    for(int i=0;i<arr.length;i++){
        arr[i] = scan.nextInt();
    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            System.out.print(arr[i*cols+j]+" ");
        }
        System.out.println();
    }
 }

}