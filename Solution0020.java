package com.qing.oop;


import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        String s1="()";
        String s2="()[]{}";
        String s3="(]";
        String s4="([)]";
        String s5="{[]}";
        Solution solution = new Solution();
        System.out.println(solution.isValid(s1));
        System.out.println(solution.isValid(s2));
        System.out.println(solution.isValid(s3));
        System.out.println(solution.isValid(s4));
        System.out.println(solution.isValid(s5));


    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(')stack.push(')');
            else if(c=='[')stack.push(']');
            else if(c=='{')stack.push('}');
            else if(stack.isEmpty()||c!=stack.pop())return false;
        }
        return stack.isEmpty();
    }
}
