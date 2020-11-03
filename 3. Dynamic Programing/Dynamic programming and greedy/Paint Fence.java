// 1. You are given a number n and a number k in separate lines, representing the number of fences and number of colors.
// 2. You are required to calculate and print the number of ways in which the fences could be painted so that not more than two fences have same colors.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int same = k*1;
        int diff = k * (k-1);
        int total = same + diff;
        for(int i=2;i<n;i++){
            same = diff*1;
            diff = total *(k-1);
            total = same+diff;
        }
        System.out.println(total);

    }
}