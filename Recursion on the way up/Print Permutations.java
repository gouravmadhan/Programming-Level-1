// 1. You are given a string str.
// 2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
// Use sample input and output to take idea about permutations.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        printPermutations(str,"");
    }

    public static void printPermutations(String str,String res) {
        if(str.length()==0){
            System.out.println(res);
            return;
        }
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            String sub = str.substring(0,i)+ str.substring(i+1);
            printPermutations(sub,res+ch);
        }
        
    }

}