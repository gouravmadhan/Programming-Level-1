// 1. You are required to complete the code of our Priority Queue class using the heap data structure. Please watch the question video carefully. The theoretical details of required functionality is explained in detail there. Implement the functions to achieve what is explained in the theoretical discussion in question video.
// 2. Here is the list of functions that you are supposed to complete:
//     2.1. add -> Should accept new data.
//     2.2. remove -> Should remove and return smallest value, if available or print 
//      "Underflow" otherwise and return -1.
//      2.3. peek -> Should return smallest value, if available or print "Underflow" 
//      otherwise and return -1.
//      2.4. size -> Should return the number of elements available.
// 3. Input and Output is managed for you.
import java.io.*;
import java.util.*;

public class Main {

    public static class PriorityQueue {
        ArrayList < Integer > data;

        public PriorityQueue() {
            data = new ArrayList < > ();
        }

        public void add(int val) {
            // write your code here
            data.add(val);
            upheapify(data.size()-1);

        }
        private void upheapify(int child){
            int parent = (child - 1) / 2;
            if(data.get(child) < data.get(parent)){
                swap(child,parent);
                upheapify(parent);
            }
        }
        private void swap(int i, int j){
            int one = data.get(i);
            int two = data.get(j);
            data.set(i, two);
            data.set(j, one);
        }

        public int remove() {
            // write your code here
            if(data.size()==0){
                System.out.println("Underflow");
                return -1;
            }
            swap(0, data.size()-1);
            int val = data.remove(data.size()-1);
            downheapify(0);
            return val;
        }
        private void downheapify(int parent){
            int min = parent;
            int lc = parent * 2 + 1;
            if(lc < data.size() && data.get(lc) < data.get(min) ){
                min = lc;
            }
            int rc = parent * 2 + 2;
            if(rc < data.size() && data.get(rc) < data.get(min)){
                min = rc;
            }
            if(min != parent){
                swap(parent, min);
                downheapify(min);
            }
        }

        public int peek() {
            // write your code here
            if(data.size() == 0){
                System.out.println("Underflow");
                return -1;
            }
            return data.get(0);
        }

        public int size() {
            // write your code here
            return data.size(); 
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue qu = new PriorityQueue();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}