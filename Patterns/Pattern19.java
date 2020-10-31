// *	*	*		*	
//   		*		*	
// *	*	*	*	*	
// *		*			
// *		*	*	*	
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n =scn.nextInt();
    for(int i=0;i<n;i++){
        if(i==0){
            for(int j=0;j<n;j++){
                if(j<=n/2||j==n-1){
                    System.out.print("*\t");
                }
                else
                    System.out.print("\t");
            }
            
        }
        else if(i<n/2){
            for(int j=0;j<n;j++){
                if(j==n/2||j==n-1){
                    System.out.print("*\t");
                }
                else
                    System.out.print("\t");
            }
            
        }
        else if(i==n/2){
            for(int j=0;j<n;j++)
                System.out.print("*\t");
                
        }
        else if(i<n-1){
            for(int j=0;j<n;j++){
                if(j==n/2||j==0){
                    System.out.print("*\t");
                }
                else
                    System.out.print("\t");
            }
            
        }
        else{
            for(int j=0;j<n;j++){
                if(j>=n/2||j==0){
                    System.out.print("*\t");
                }
                else
                    System.out.print("\t");
            }
            
        }
        System.out.println();
    }

 }
}