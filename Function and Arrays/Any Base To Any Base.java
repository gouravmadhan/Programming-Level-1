// 1. You are given a number n.
// 2. You are given a base b1. n is a number on base b.
// 3. You are given another base b2.
// 4. You are required to convert the number n of base b1 to a number in base b2.
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int d = findNumber(n,sourceBase,destBase);
     System.out.println(d);
   }   
   public static int findNumber(int a,int b, int c){
       int num=1;
       int rv=0;
       while(a>0){
           int digit = a%10;
           a=a/10;
           rv+=digit*num;
           num=num*b;
       }
       a = rv;
       rv=0;
       num=1;
       while(a>0){
           int digit = a%c;
           a = a/c;
           rv+= digit*num;
           num=num*10;
       }
       return rv;
   }
  }