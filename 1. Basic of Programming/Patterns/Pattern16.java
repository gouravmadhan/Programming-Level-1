// 1												1	
// 1	2										2	1	
// 1	2	3								3	2	1	
// 1	2	3	4						4	3	2	1	
// 1	2	3	4	5				5	4	3	2	1	
// 1	2	3	4	5	6		6	5	4	3	2	1	
// 1	2	3	4	5	6	7	6	5	4	3	2	1	
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int count =1;
    int left = 1;
    for(int i=0;i<n;i++){
        for(int j=0;j<left;j++){
            System.out.print(count+"\t");
            count++;
        }
        for(int j=0;j<n*2-1 - 2*left;j++){
            System.out.print("\t");
        }
        if(i<n-1)
        for(int j=0;j<left;j++){
            count--;
            System.out.print(count+"\t");
        }
        else{
            count--;
         for(int j=0;j<left-1;j++){
            count--;
            System.out.print(count+"\t");
        }   
        }
        System.out.println();
        left++;
    }

     // write ur code here

 }
}