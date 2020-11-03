// *	*	*	*	*	*	*	
//   	*				*	
// 	    	*		*	
// 		    	*	
// 		    *	*	*	
// 	    *	*	*	*	*	
// *	*	*	*	*	*	*	
import java.util.*;
// *	*	*	*	*	*	*	
//   	*				*	
// 	    	*		*	
// 		    	*	
//  		*	*	*	
// 	    *	*	*	*	*	
//  *	*	*	*	*	*	*	
public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     int n =scn.nextInt();
     int left=0;
     int right=n-1;
     for(int  i=0;i<n;i++){
         if(i==0){
             for(int j=0;j<n;j++){
                System.out.print("*\t");
                
             }
             left++;
                right--;
         }
         else if(i<=n/2){
             for(int j=0;j<n;j++){
                 if(j==left||j==right)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
             }
             left++;
             right--;
         }
         else{
            for(int j=0;j<n;j++){
                 if(j<=left&&j>=right)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
             }
             left++;
             right--;
         }
         System.out.println();
     }

 }
}