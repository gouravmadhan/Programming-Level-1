// 1. You are given a list of lists, where each list is sorted.
// 2. You are required to complete the body of mergeKSortedLists function. The function is expected to merge k sorted lists to create one sorted list.
import java.io.*;
import java.util.*;

public class Main {
    public static class Pair implements Comparable <Pair>{
        int list;
        int index;
        int data;
        Pair(int list,int index , int data){
            this.list = list;
            this.index = index;
            this.data = data;
        }
        public int compareTo(Pair o){
            return this.data - o.data;
        }

    }
    public static ArrayList < Integer > mergeKSortedLists(ArrayList < ArrayList < Integer >> lists) {
        ArrayList < Integer > rv = new ArrayList < > ();
        PriorityQueue < Pair > pq = new PriorityQueue<>();
        for(int i = 0 ;i < lists.size() ; i++){
            Pair p = new Pair(i, 0, lists.get(i).get(0));
            pq.add(p);
        }
        while(pq.size()>0){
            Pair p = pq.remove();
            rv.add(p.data);
            p.index++;
            if(p.index < lists.get(p.list).size()){
                p.data = lists.get(p.list).get(p.index);
                pq.add(p);
            }
        }

        return rv;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        ArrayList < ArrayList < Integer >> lists = new ArrayList < > ();
        for (int i = 0; i < k; i++) {
            ArrayList < Integer > list = new ArrayList < > ();

            int n = Integer.parseInt(br.readLine());
            String[] elements = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                list.add(Integer.parseInt(elements[j]));
            }

            lists.add(list);
        }

        ArrayList < Integer > mlist = mergeKSortedLists(lists);
        for (int val: mlist) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}