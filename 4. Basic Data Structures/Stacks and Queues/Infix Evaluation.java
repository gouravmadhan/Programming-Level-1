// 1. You are given an infix expression.
// 2. You are required to evaluate and print it's value.
import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack <Integer> opnds = new Stack<>();
    Stack <Character> operators = new Stack<>();
    for(int i =0 ;i< exp.length();i++){
        char ch = exp.charAt(i);
        if(ch=='('){
            operators.push(ch);
        }else if(Character.isDigit(ch)){
            opnds.push(ch-'0');
            
        }else if(ch==')'){
            while(operators.peek()!='('){
                char optr = operators.pop();
                int v2 = opnds.pop();
                int v1 = opnds.pop();
                int  opv = operation(v1,v2,optr);
                opnds.push(opv);
            }
            operators.pop();
        }else if(ch =='+'||ch =='-'||ch=='*'||ch=='/'){
            while(operators.size()>0 && operators.peek()!='(' 
            && precedence(ch)<=precedence(operators.peek())){
                char optr = operators.pop();
                int v2 = opnds.pop();
                int v1 = opnds.pop();
                int  opv = operation(v1,v2,optr);
                opnds.push(opv);
            }
            operators.push(ch);
        }   
    }
    while(operators.size()!=0){
                char optr = operators.pop();
                int v2 = opnds.pop();
                int v1 = opnds.pop();
                int  opv = operation(v1,v2,optr);
                opnds.push(opv);
            }
            System.out.println(opnds.peek());
    
 }
    public static int precedence(char ch){
        if(ch=='+'){
            return 1;
        }else if(ch =='-'){
            return 1;
        }
        else if(ch =='*'){
            return 2;
        }
        else{
            return 2;
        }
    }
    public static int operation(int a,int b, char ch){
        if(ch=='+'){
            return a+b;
        }else if(ch =='-'){
            return a-b;
        }
        else if(ch =='*'){
            return a*b;
        }
        else{
            return a/b;
        }
    }
}