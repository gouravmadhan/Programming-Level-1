// 1. You are given a number n, representing the number of rows and columns of a square matrix.
// 2. You are given n * n numbers, representing elements of 2d array a.
// 3. You are required to find the saddle point of the matrix which is defined as the value which is smallest in it's row but largest in it's column.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] =scan.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int index = 0;
            for(int j=0;j<n;j++){
                if(arr[i][j]<arr[i][index]){
                    
                    index = j;
                }
            }
            boolean flag = true;
            for(int j=0;j<n;j++){
                if(arr[j][index]>arr[i][index]){
                    flag=false;
                    break;
                    
                }
            }
            if(flag==true)
            {
                System.out.println(arr[i][index]);
                return;
            }
            
        }
        System.out.println("Invalid input");
        
    }

}