import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int low=scan.nextInt();
        int high = scan.nextInt();
        for(int i=low;i<=high;i++){
            int count = 0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0)
                count++;
            }
            if(count==0)
                System.out.println(i);
        }
    }
}