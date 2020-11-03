// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a, which represents a maze.
// 4. You are standing in top-left cell and are required to move to bottom-right cell.
// 5. You are allowed to move 1 cell right (h move) or 1 cell down (v move) in 1 motion.
// 6. Each cell has a value that will have to be paid to enter that cell (even for the top-left and bottom- 
//      right cell).
// 7. You are required to traverse through the matrix and print the cost of path which is least costly.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int arr[][] = new int[n][m];
        int dp[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++)
                arr[i][j] = scan.nextInt();
        }
        
        for(int i=dp.length-1 ; i >= 0;i--){
            for(int j = dp[0].length-1;j>=0;j--){
                if(i==dp.length-1 && j==dp[0].length-1){
                    dp[i][j] = arr[i][j];
                }
                else if(i==dp.length-1){
                    dp[i][j] = dp[i][j+1] + arr[i][j];
                }
                else if(j==dp[0].length-1){
                    dp[i][j] = dp[i+1][j] + arr[i][j];
                }
                else{
                    dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1])+arr[i][j];
                }
            }
        }
        System.out.println(dp[0][0]);
        
    }

}