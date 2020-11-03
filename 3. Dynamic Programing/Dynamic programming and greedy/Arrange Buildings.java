// 1. You are given a number n, which represents the length of a road. The road has n plots on it's each side.
// 2. The road is to be so planned that there should not be consecutive buildings on either side of the road.
// 3. You are required to find and print the number of ways in which the buildings can be built on both side of roads.
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long dpb[] = new long[n+1];
    long dps[] = new long[n+1];
    dpb[1] = 1;
    dps[1] = 1;
    for(int i=2;i<=n;i++){
        dpb[i] = dps[i-1];
        dps[i] = dps[i-1] + dpb[i-1];
    }
    long total = dps[n]+dpb[n];
    total *= total;
    
    System.out.println(total);
 }

}