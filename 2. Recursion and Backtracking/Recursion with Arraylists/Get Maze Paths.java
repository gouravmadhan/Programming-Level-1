// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
// 3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        ArrayList <String> path = getMazePaths(1,1,n,m);
        System.out.println(path);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr&&sc==dc){
            ArrayList <String> path = new ArrayList<>();
            path.add("");
            return path;
        }
        ArrayList <String> hpath = new ArrayList<>();
        ArrayList <String> vpath = new ArrayList<>();
        
        if(sc<dc){
            hpath = getMazePaths(sr,sc+1,dr,dc);
        }
        if(sr<dr)
            vpath =getMazePaths(sr+1,sc,dr,dc);
        ArrayList <String > result = new ArrayList<>();
        for(String str : hpath){
            result.add("h"+str);
        }
        for(String str : vpath){
            result.add("v"+str);
        }
        return result;
        
    }

}