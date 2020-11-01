// 1. You are given a number n, representing the number of rows of a matrix.
// 2. You are given a number m, representing the number of columns of a matrix.
// 3. You are given n * m numbers, representing elements of 2d array a.

// shell-rotate

// 4. You are given a shell number s. For details check image.
// 5. You are given a number r, representing number of anti-clockwise rotations (for +ve numbers) of the shell s.
// 6. You are required to rotate the sth shell of matrix by r rotations and display the matrix using display function.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt(); 
        
        int arr[][] =  new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int s = scan.nextInt();
        int r = scan.nextInt();
        rotateShell(arr,s,r);
        display(arr);
        
    }
    public static void rotateShell(int arr[][] ,int s ,int r ){
        int odarr[] = getOneDArray(arr,s);
        // System.out.println(r);
        // for(int i=0;i<odarr.length;i++)
        //     System.out.print(odarr[i]+" ");
        rotate(odarr, r);
        // System.out.println();
        // for(int i=0;i<odarr.length;i++)
        //     System.out.print(odarr[i]+" ");
        fillArray(arr,s,odarr);
        
    }
    public static int[] getOneDArray(int arr[][] , int s){
        
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length - s;
        int maxc = arr[0].length -s;
        int finalarr[]  = new int[2*(maxc-minc+maxr-minr)];
        int index = 0;
        for(int i = minr,j=minc ; i<=maxr ;i++){
            finalarr[index++] = arr[i][j];
        }
        for(int i = minc+1,j = maxr;i<=maxc;i++){
            finalarr[index++] = arr[j][i];
        }
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            finalarr[index++] = arr[i][j];
        }
        for(int i=maxc-1,j=minr ; i>=minc+1;i--){
            finalarr[index++] = arr[j][i];
        }
        return finalarr;
    }
    public static void rotate(int arr[],int r){
        r=r%arr.length;
        if(r<0)
            r=r+arr.length;
        reverse(arr,0,arr.length-r-1);
        reverse(arr,arr.length-r,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void reverse(int arr[], int low,int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void fillArray(int arr[][],int s,int odarr[]){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length - s;
        int maxc = arr[0].length -s;
        int index = 0;
        for(int i = minr,j=minc ; i<=maxr ;i++){
             arr[i][j]=odarr[index++] ;
        }
        for(int i = minc+1,j = maxr;i<=maxc;i++){
            arr[j][i]=odarr[index++];
        }
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            arr[i][j]=odarr[index++];
        }
        for(int i=maxc-1,j=minr ; i>=minc+1;i--){
            arr[j][i]=odarr[index++];
        }
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}