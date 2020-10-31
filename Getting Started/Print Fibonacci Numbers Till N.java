import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int one = 0;
      int second = 1;
      for(int  i=0;i<n;i++){
          if(i==0){
            System.out.println(one);
          }
          else if(i==1){
              System.out.println(second);
          }
          else{
              int temp = one+second;
              one = second;
              second = temp;
              System.out.println(second);
              
          }
      }
   }
  }