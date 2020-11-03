// 1. You are given a number n and a number k separated by a space, representing the number of houses and number of colors.
// 2. In the next n rows, you are given k space separated numbers representing the cost of painting nth house with one of the k colors.
// 3. You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int dp[][] = new int[row][col];
        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;
        for(int i=0;i<col;i++){
            dp[0][i] = arr[0][i];
            if(least>=dp[0][i]){
                sleast = least;
                least = dp[0][i];
                
            }
            else if(sleast >= dp[0][i]){
                sleast = dp[0][i];
            }
        }
        for(int i=1;i<row;i++){
            int nleast=Integer.MAX_VALUE;
            int nsleast = Integer.MAX_VALUE;
            for(int j=0;j<col;j++){
                if(least != dp[i-1][j]){
                    dp[i][j] = least + arr[i][j];
                }
                else{
                    dp[i][j] = sleast + arr[i][j];
                }
                if(nleast>=dp[i][j]){
                nsleast = nleast;
                nleast = dp[i][j];
                
                }
                else if(nsleast >= dp[i][j]){
                    nsleast = dp[i][j];
                }
            }
            
        
            least = nleast;
            sleast = nsleast;
        }
        System.out.println(least);
    }
}