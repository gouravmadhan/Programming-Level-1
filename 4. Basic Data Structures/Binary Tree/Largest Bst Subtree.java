// 1. You are given a partially written BinaryTree class.
// 2. You are required to find the root of largest sub-tree which is a BST. Also, find the number of nodes in that sub-tree.
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
    static class BST{
        boolean isbst;
        int min;
        int max;
        Node root;
        int size;
    }
    public static BST isTreeBst(Node node){
        if(node == null){
            BST bt = new BST();
            bt.isbst = true;
            bt.max = Integer.MIN_VALUE;
            bt.min = Integer.MAX_VALUE;
            bt.size = 0;
            bt.root = null;
            return bt;
        }
        BST lt = isTreeBst(node.left);
        BST rt = isTreeBst(node.right);
        BST mt = new BST();
        mt.isbst = lt.isbst && rt.isbst && node.data >= lt.max && node.data<=rt.min;
        mt.max = Math.max(node.data, Math.max(lt.max, rt.max));
        mt.min = Math.min(node.data, Math.min(lt.min, rt.min));
        if(mt.isbst){
            mt.root = node;
            mt.size = lt.size + rt.size + 1;
        }else if(lt.size > rt.size){
            mt.root = lt.root;
            mt.size = lt.size;
        }else{
            mt.root = rt.root;
            mt.size = rt.size;
        }
        return mt;
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
        BST bt  = isTreeBst(root);
        System.out.println(bt.root.data+"@"+bt.size);
        
        
    }

}