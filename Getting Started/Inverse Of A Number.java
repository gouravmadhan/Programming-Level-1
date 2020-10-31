import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
    // Scanner scan = new Scanner(System.in);
    // int n = scan.nextInt();
    // int temp = n;
    // int count = 0;
    // int power=1;
    // while(temp>0){
    //     temp=temp/10;
    //     count++;
        
    // }
    // int z = count;
    // int arr[] = new int[count];
    // int result[] = new int[count];
    // power*= Math.pow(10,count-1);
    // count=0;

    // temp = n;
    // while(power != 0){
    //     int digit = temp / power;
    //     arr[count++] = digit;
    //     temp = temp % power;
    //     power = power / 10;
    // }
    // for(int i=0;i<arr.length;i++){
    //     temp = arr[z-i-1];
        
    //      result[z-temp] = i+1;
    // }
    // for(int i=0;i<result.length;i++){
    //     System.out.print(result[i]);
    // }
     Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //426135
        int result = 0 ;
        int itr = 1;
        while(n>0){
            int digit = n%10;
            n = n/10;
            result += itr*Math.pow(10,digit-1);
            itr++;
        }
        System.out.println(result);
 }
}