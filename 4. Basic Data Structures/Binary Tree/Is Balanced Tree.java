// 1. You are given a partially written BinaryTree class.
// 2. You are required to check if the tree is balanced. A binary tree is balanced if for every node the gap between height's of it's left and right subtree is not more than 1.
// 3. Input is managed for you. 
import java.io.*;
import java.util.*;
public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack < Pair > st = new Stack < > ();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }
    static boolean isbal = true;
    public static int isbalance(Node node){
        if( node == null){
            return 0;
        }
        int lh = isbalance(node.left);
        int rh = isbalance(node.right);

        int th = Math.max(lh, rh)+1;
        int gap = Math.abs(lh-rh);
        if(gap>1){
            isbal = false;
        }
        return th;

    }
    static class BalPair{
        int ht ;
        boolean isbal ;
    }
    public static BalPair isBala(Node node){
        if(node == null){
            BalPair bp = new BalPair();
            bp.ht =0;
            bp.isbal = true;
            return bp;
        }

        BalPair lp = isBala(node.left);
        BalPair rp = isBala(node.right);
        BalPair mp = new BalPair();
        mp.ht = Math.max(lp.ht, rp.ht) + 1;
        mp.isbal = Math.abs(lp.ht-rp.ht)<=1 && lp.isbal && rp.isbal;
        return mp;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        Node root = construct(arr);
        
        // write your code here
        // method 1 without class 
        // isbalance(root);
        // System.out.println(isbal);

        // second method by using class
        BalPair bp = isBala(root);
        System.out.print(bp.isbal);


    }

}