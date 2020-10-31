import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int i = 2;
    while(n>1){
        while(n%i==0){
            System.out.print(i+" ");
            n/=i;
        }
        i++;
    }
}
}