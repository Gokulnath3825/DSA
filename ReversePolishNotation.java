package stack;

import java.util.Stack;

public class ReversePolishNotation {

    public static int token(String[] sd){

        Stack<Integer> stack = new Stack<>();

        for(String s : sd){

            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){

                int b = stack.pop();
                int a = stack.pop();

                switch(s){
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                }
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();


    }
    
    public static void main(String[] args) {
        
        System.out.println(token(new String[]{"2", "1", "+", "3", "*"}));
    }
}
