// *				*	
// *				*	
// *		*		*	
// *	*		*	*	
// *				*	
import java.util.*;
// *				*	
// *				*	
// *		*		*	
// *	*		*	*	
// *				*	
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int left=0,right=0;
        for(int i=0;i<n;i++){
            if(i<n/2){
                for(int j=0;j<n;j++){
                    if(j==0||j==n-1){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
            }
            else if(i==n/2){
                for(int j=0;j<n;j++){
                    if(j==0||j==n-1||j==n/2){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
                left=n/2-1;
                right=n/2+1;
                
            }
            else{
                for(int j=0;j<n;j++){
                    if(j==0||j==n-1||j==left||j==right){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
                
            }
            if(i>n/2){
            left--;
            right++;}
            System.out.println();
        }

        // write ur code here

    }
}