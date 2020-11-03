// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to toggle the case of every character of the given string.
import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		//write your code here
		StringBuilder sb = new StringBuilder(str);
		for(int i=0;i<str.length() ;i++ ){
		    char ch = str.charAt(i);
		    if(ch>='a' && ch<='z')
		    {
		        char upr = (char)('A'+ch-'a');
		        sb.setCharAt(i,upr);
		    }
		    else if(ch>='A' && ch<='Z')
		    {
		        char upr = (char)('a'+ch-'A');
		        sb.setCharAt(i,upr);
		    }
		}
		

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}