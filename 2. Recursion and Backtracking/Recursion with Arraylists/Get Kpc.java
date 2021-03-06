// 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
// 2. The following list is the key to characters map :
//     0 -> .;
//     1 -> abc
//     2 -> def
//     3 -> ghi
//     4 -> jkl
//     5 -> mno
//     6 -> pqrs
//     7 -> tu
//     8 -> vwx
//     9 -> yz
// 3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        ArrayList <String> list = getKPC(str);
        System.out.println(list);
    }
    static String arr[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList <String> li = new ArrayList<>();
            li.add("");
            return li;
        }
        char ch = str.charAt(0);
        String rest_string = str.substring(1);
        ArrayList <String> out_from_rec = getKPC(rest_string);
        ArrayList <String> result = new ArrayList<>();
        String s = arr[ch-'0'];
        for(int i=0;i<s.length();i++){
            char single = s.charAt(i);
            for(String st : out_from_rec){
                result.add(single+st);
            }
        }
        return result;
        
    }

}