// *	*	*		*	*	*	
// *	*				*	*	
// *						*	
// *	*				*	*	
// *	*	*		*	*	*	
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int k=0;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=n/2-k;j++){
                System.out.print("*\t");
            }
            for(int j=0;j<2*k;j++){
                System.out.print("\t");
            }
            for(int j=0;j<=n/2-k;j++){
                System.out.print("\t*");
            }
            if(i<n/2)
                k++;
            else{
                k--;
            }
            System.out.println();
        }
    }
}