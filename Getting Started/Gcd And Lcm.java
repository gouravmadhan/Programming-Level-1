import java.util.*;
    
    public class Main{
        public static int findGCD(int a , int b){
            int less = a>b?b:a;
            int max=1;
            for(int i = 1;i<=less;i++){
                if((a%i==0)&&(b%i==0)){
                    max = i;
                }
            }
            return max;
        }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int gcd = findGCD(a,b);
        System.out.println(gcd);
        System.out.println(gcd*(a/gcd)*(b/gcd));
        
    }
}