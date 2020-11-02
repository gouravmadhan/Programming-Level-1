// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
// 3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        ArrayList<String> arr= getStairPaths(n);
        System.out.println(arr);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList <String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }
        else if(n<0){
            ArrayList <String> arr = new ArrayList<>();
            return arr;
        }
        ArrayList<String> list1 = getStairPaths(n-1);
        ArrayList<String> list2 = getStairPaths(n-2);
        ArrayList<String> list3 = getStairPaths(n-3);
        ArrayList<String> result  = new ArrayList<>();
        for(String str : list1){
            result.add(1+str);
        }
        for(String str : list2){
            result.add(2+str);
        }
        for(String str : list3){
            result.add(3+str);
        }
        return result;
    }

}