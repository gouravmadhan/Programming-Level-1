// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing the height of bars in a bar chart.
// 3. You are required to find and print the area of largest rectangle in the histogram.

// e.g.
// for the array [6 2 5 4 5 1 6] -> 12
import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int max = Integer.MIN_VALUE;
    Stack<Integer> st = new Stack<>();
    for(int i =0;i<a.length ; i++){
        if(st.isEmpty() || a[i] >= a[st.peek()]){
            st.push(i);
        }
        else{
            while(!st.isEmpty() && a[i] < a[st.peek()]){
                int p = a[st.peek()];
                st.pop();
                int dist = st.isEmpty()?i:i-st.peek()-1;
                int area = dist * p;
                if(max<area)
                    max = area;
            }
            st.push(i);
        }
        
    }
    while(!st.isEmpty()){
        int x = a[st.peek()];
        st.pop();
        int dist = st.isEmpty() ? n : n- st.peek()-1;
        int area = dist * x;
        if(max<area)
                    max = area;
        
    }
    System.out.println(max);
    // code
 }
}