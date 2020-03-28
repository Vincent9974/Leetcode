package 数据结构;



import java.util.Collection;
import java.util.Stack;

public class Stack0020 {
    public static void main(String[] args) {
//https://leetcode-cn.com/problems/valid-parentheses/ 有效的括号
        Stack0020 stack0020 = new Stack0020();
        boolean b = stack0020.isValid("(878)[]{}");
        System.out.println(b);

    }

    public boolean isValid(String s ){
        Stack<Character> mark = new Stack<Character>();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){mark.push(s.charAt(i));}
            else if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}'){
                if(mark.isEmpty())return false;
                char cur = mark.pop();
                if(cur =='('&& s.charAt(i)!=')') return false;
                if(cur =='['&& s.charAt(i)!=']') return false;
                if(cur =='{'&& s.charAt(i)!='}') return false;
            }
        }
        if(mark.isEmpty()) return true;
        return false;
    }
}
