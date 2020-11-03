import java.util.*;
  
  public class Main{
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a>b && a>c){
                System.out.println(a*a == (b*b+c*c) );
            
        }
        else if(b>a && b>c){
                System.out.println(b*b == (a*a+c*c) );
            
        }
        else if(c>a && c>b){
            System.out.println(c*c == (a*a+b*b));
            
        }
        
    }
}