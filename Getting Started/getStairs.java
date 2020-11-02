// if n =10 the stairs will be 1 2 3 4 so total stairs can be formed 4
// if n = 20 the stairs will be 1 2 3 4 5 so total stairs can be formed 5
// if n = 21 the stairs will be 1 2 3 4 5 6  so total stairs can be formed 6
 


import java.util.*;

public class Main
{
    public static int getn(int n){
        int count =0;
        int i =1;
        while(n>0){
            n=n-i;
            i++;
            if(n>=0)
                count++;
        }
        return count;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(getn(n));
	}
}
