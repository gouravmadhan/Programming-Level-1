//          *	
//      *	*	*	
// *	*	*	*	*	
//      *	*	*	
//          *	
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int dist = n/2;
        for(int i =0;i<n/2;i++){
            for(int j=0;j<dist;j++){
                System.out.print("\t");
            }
            for(int j=0;j<n-2*dist;j++){
                System.out.print("*\t");
            }
            dist--;
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.print("*\t");
        }
        System.out.println();
        for(int i =n/2+1;i<n;i++){
            dist++;
            for(int j=0;j<dist;j++){
                System.out.print("\t");
            }
            for(int j=0;j<n-2*dist;j++){
                System.out.print("*\t");
            }
            
            System.out.println();
        }

        // write ur code here

    }
}