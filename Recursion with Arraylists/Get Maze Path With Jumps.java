// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. 
// 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
// 4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        ArrayList <String> arr = getMazePaths(1,1,n,m);
        System.out.println(arr);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sc==dc&&sr==dr){
            ArrayList <String> rest = new ArrayList<>();
            rest.add("");
            return rest;
        }
        
        ArrayList <String> result = new ArrayList<>();
        for(int i = 1;i<= dc-sc ; i++){
            ArrayList <String> hlist = getMazePaths(sr,sc+i,dr,dc);
            for(String str : hlist){
                result.add("h"+i+str);
            }
        }
        for(int i = 1;i<= dr-sr ; i++){
            ArrayList <String> vlist = getMazePaths(sr+i,sc,dr,dc);
            for(String str : vlist){
                result.add("v"+i+str);
            }
        }
        for(int i = 1;i<= dr-sr && i<=dc-sc; i++){
            ArrayList <String> dlist = getMazePaths(sr+i,sc+i,dr,dc);
            for(String str : dlist){
                result.add("d"+i+str);
            }
        }
        return result;
    }

}