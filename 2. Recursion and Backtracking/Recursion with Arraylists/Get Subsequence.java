// 1. You are given a string str.
// 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
// Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        ArrayList <String >  list= gss(str);
        System.out.println(list);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0)
        {
            ArrayList <String> a = new ArrayList<>();
            a.add("");
            return a;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList <String> rosr = gss(ros);
        ArrayList <String> result  = new ArrayList<>();
        for(String s : rosr){
            result.add("" + s);
            // result.add(ch + s);
        }
        for(String s : rosr){
            // result.add("" + s);
            result.add(ch + s);
        }
        return result;
    }

}