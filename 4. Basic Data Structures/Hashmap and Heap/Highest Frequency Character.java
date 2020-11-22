// 1. You are given a string str.
// 2. You are required to find the character with maximum frequency.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        HashMap <Character,Integer> map = new HashMap<>();
        for(int i = 0 ;i < str.length() ; i++){
            char ch = str.charAt(i);
            if(map.get(ch)==null){
                map.put(ch, 1);
            }else{
                map.put(ch, map.get(ch)+1);
            }
        }
        Set <Character> keys = map.keySet();
        int mf = 0;
        char mfc = str.charAt(0);
        for(Character ch : keys){
            if(map.get(ch)>mf){
                mf = map.get(ch);
                mfc = ch;
            }
        }
        System.out.println(mfc);
    }

}