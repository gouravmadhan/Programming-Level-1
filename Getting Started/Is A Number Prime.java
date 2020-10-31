import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       
        for(int j=0;j<n;j++){
            int num = scn.nextInt();
            int count=0;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0)
                    count++;
            }
            if(count==0)
                System.out.println("prime");
            else{
                System.out.println("not prime");
            }
        }
   }
}