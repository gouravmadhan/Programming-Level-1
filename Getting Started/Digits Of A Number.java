//Method 1
// import java.util.*;
    
//     public class Main{
    
//     public static void main(String[] args) {
//       // write your code here  
//       Scanner scn = new Scanner(System.in);
//             int n = scn.nextInt();
    
//             int power = 1;
//             int temp = n;
//             while (temp >= 10) {
//                 temp /= 10;
//                 power *= 10;
//             }
    
//             temp = n;
//             while(power != 0){
//                 int digit = temp / power;
//                 System.out.println(digit);
    
//                 temp = temp % power;
//                 power = power / 10;
//             }
//       }
//     }


//Method 2
import java.util.*;
    
    public class Main {
    
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
    
            int power = 1;
            int temp = n;
            while (temp > 10) {
                temp /= 10;
                power *= 10;
            }
    
            temp = n;
            while(power != 0){
                int digit = temp / power;
                System.out.println(digit);
    
                temp = temp % power;
                power = power / 10;
            }
        }
    }