// 1. You are given a string. 
// 2. You have to print all palindromic substrings of the given string.
import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		//write your code here
		for(int i=0;i<str.length();i++){
		    for(int j=i+1;j<=str.length();j++){
		        String s = str.substring(i,j);
		        int low =0;
		        int high = s.length()-1;
		        boolean flag = true;
		        while(low<high){
		            if(s.charAt(low)==s.charAt(high)){
		                low++;
		                high--;
		            }
		            else{
		                flag=false;
		                break;
		            }
		            
		        }
		        if(flag == true)
		            System.out.println(s);
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}