// 1. You are given a string str.
// 2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        printSS(str,"");

    }

    public static void printSS(String que, String ans) {
        if(que.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = que.charAt(0);
        String rest = que.substring(1);
        printSS(rest, ans+ch);
        printSS(rest,ans+"");
    }

}