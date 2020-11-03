// 1. You are given an ArrayList of positive integers.
// 2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.

// Note -> The order of elements should remain same.
import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al){
		// write your code here
		for(int i=0;i<al.size();i++){
		    int no = al.get(i);
		    int count=0;
		    for(int j=2;j<=(int)(Math.sqrt(no));j++){
		        if(no%j==0)
		            count++;
		    }
		    if(count==0){
		        al.remove(i);
		        i--;
		    }
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}