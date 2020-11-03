// 1. You are given a string. 
// 2. You have to print all permutations of the given string iteratively.
import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		// write your code here
		int n = str.length();
		int p = findPer(n);
		for(int i=0;i<p;i++){
		    StringBuilder sb = new StringBuilder(str);
		    int temp =i;
		    for(int j = n;j>=1;j--){
		        int q = temp/j;
		        int r = temp%j;
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        temp=q;
		    }
		    System.out.println();
		}
		
	}
	public static int findPer(int n){
	    int p=1;
	    for(int i =2;i<=n;i++){
	        p=p*i;
	    }
	    return p;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}