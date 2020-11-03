// 1. You are given a number n, representing the number of rows and columns of a square matrix.
// 2. You are given n * n numbers, representing elements of 2d array a.
// 3. You are required to diagonally traverse the upper half of the matrix and print the contents.
// For details check image.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] =scan.nextInt();
            }
        }
        for(int g=0;g<n;g++){
            for(int i=0,j=g;j<n;i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }

}