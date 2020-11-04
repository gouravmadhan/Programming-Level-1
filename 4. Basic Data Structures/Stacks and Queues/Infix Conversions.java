// 1. You are given an infix expression.
// 2. You are required to convert it to postfix and print it.
// 3. You are required to convert it to prefix and print it.
import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack < String > prefix = new Stack < > ();
        Stack < String > postfix = new Stack < > ();
        Stack < Character > operation = new Stack < > ();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                operation.push(ch);
            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                prefix.push(ch + "");
                postfix.push(ch + "");
            } else if (ch == ')') {
                while (operation.peek() != '(') {
                    char op = operation.pop();
                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop();
                    String postr = postv1 + postv2 + op;
                    postfix.push(postr);

                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();
                    String prer = op + prev1 + prev2;
                    prefix.push(prer);

                }
                operation.pop();
            } else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                while (operation.size() > 0 && operation.peek() != '(' && precedence(ch) <= precedence(operation.peek())) {
                    char op = operation.pop();
                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop();
                    String postr = postv1 + postv2 + op;
                    postfix.push(postr);
                    
                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();
                    String prer = op + prev1 + prev2 ;
                    prefix.push(prer);

                }
                operation.push(ch);
            }
        }
        while (operation.size() > 0 ){
                char op = operation.pop();
                String postv2 = postfix.pop();
                String postv1 = postfix.pop();
                String postr = postv1 + postv2 + op;
                postfix.push(postr);

                String prev2 = prefix.pop();
                String prev1 = prefix.pop();
                String prer = op + prev1 + prev2;
                prefix.push(prer);
        }
        System.out.println(postfix.peek());
        System.out.println(prefix.peek());
    }
    public static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/'){
            return 2;
        }
        else {
            return 0;
        }
    }
}