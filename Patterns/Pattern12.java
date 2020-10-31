// 0	
// 1	1	
// 2	3	5	
// 8	13	21	34	
// 55	89	144	233	377	
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int first = 0;
        int second =1 ;
        for(int i=0; i<n;i++){
            
            for(int j=0;j<=i;j++){
                if(i==0&&j==0)
                    System.out.print(first+"	");
                else if(i==1 && j==0)
                    System.out.print(second+"	");
                else{
                    int temp=first+second;
                    first= second;
                    second =temp;
                    System.out.print(second+"	");
                }
            }
            System.out.println();
        }
        // write ur code here

    }
}