// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to traverse and print the contents of the 2d array in form of a spiral.
// Note - Please check the sample output for details.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
    int row = scan.nextInt();
    int col = scan.nextInt();
    int arr[][] = new int[row][col];
    for(int i =0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[i][j] =scan.nextInt();
        }
    }
    int minc = 0;
    int minr =0 ;
    int maxr=row-1;
    int maxc = col-1;
    int count = 0;
    int max = row*col;
    while(count<max){
        for(int i=minr ,j =minc ; i<=maxr && count<max ;i++ ){
            System.out.println(arr[i][j]);
            count++;
        }
        minc++;
        for(int i=minc,j=maxr; i<=maxc && count<max; i++){
            System.out.println(arr[j][i]);
            count++;
        }
        maxr--;
        for(int i = maxr,j =maxc ; i>=minr && count<max;i--){
            System.out.println(arr[i][j] );
            count++;
        }
        maxc--;
        for(int i=maxc,j=minr; i>=minc && count<max;i--){
            System.out.println(arr[j][i]);
            count++;
        }
        minr++;
    }
    
    }

}