// 1	
// 1	1	
// 1	2	1	
// 1	3	3	1	
// 1	4	6	4	1	
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int arr[][] = new int[n][];
        for(int i=0;i<n;i++){
            arr[i] = new int[i+1];
            arr[i][0] = arr[i][i] = 1;
        }
        for(int i=2;i<n;i++){
            for(int j=1;j<i;j++){
                arr[i][j]= arr[i-1][j]+arr[i-1][j-1];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        //write your code here

    }
}