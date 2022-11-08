import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancingBrackets {

    static boolean checkBalancedBrackets(String str) {
       Deque<Character> stack = new ArrayDeque<Character>();

       for(int i = 0; i < str.length(); i++) {
           char flag;
           char ch = str.charAt(i);

           if(ch == '(' || ch == '[' || ch == '{') {
               stack.push(ch);
           }
           if(stack.isEmpty()) {
               return false;
           }
           switch(ch) {
               case ')':
                   flag = stack.pop();
                   if(flag == '{' || flag == '[')
                       return false;
                   break;

               case '}':
                   flag = stack.pop();
                   if(flag == '(' || flag =='[')
                       return false;
                   break;

               case ']':
                   flag = stack.pop();
                   if(flag == '(' || flag == '{')
                       return false;
                   break;
           }
       }
       return (stack.isEmpty());
    }

}
