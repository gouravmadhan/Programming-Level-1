// *				*	
//  	*		*		
// 	    	*			
// 	    *		*		
// *				*	
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int left =0;
        int right = n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(left==j || right ==j)
                    System.out.print("*	");
                else{
                    System.out.print("	");
                }
            }
            if(i<n/2){
                left++;
                right--;
            }
            else{
                left--;
                right++;
            }
            System.out.println();
        }
        // write ur code here

    }
}