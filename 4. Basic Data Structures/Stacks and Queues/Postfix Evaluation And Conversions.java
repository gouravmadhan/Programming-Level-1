// 1. You are given a postfix expression.
// 2. You are required to evaluate it and print it's value.
// 3. You are required to convert it to infix and print it.
// 4. You are required to convert it to prefix and print it.

// Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.
import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack < Integer > vs = new Stack < > ();
        Stack < String > is = new Stack < > ();
        Stack < String > ps = new Stack < > ();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v2 = vs.pop();
                int v1 = vs.pop();
                int vv = vs.push(operation(v1, v2, ch));

                String is2 = is.pop();
                String is1 = is.pop();
                String isr = "(" + is1 + ch + is2 + ")";
                is.push(isr);

                String ps2 = ps.pop();
                String ps1 = ps.pop();
                String psr = ch + ps1 + ps2;
                ps.push(psr);

            } else {
                vs.push(ch - '0');
                is.push(ch + "");
                ps.push(ch + "");

            }
        }
        System.out.println(vs.pop());
        System.out.println(is.pop());
        System.out.println(ps.pop());
    }
    public static int operation(int a, int b, char ch) {
        if (ch == '+') {
            return a + b;
        } else if (ch == '-') {
            return a - b;
        } else if (ch == '*') {
            return a * b;
        } else {
            return a / b;
        }
    }

}