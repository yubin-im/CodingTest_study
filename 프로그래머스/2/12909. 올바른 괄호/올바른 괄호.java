import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<String> stack = new Stack<>();

        // 첫 괄호가 닫히면 false 
        if (s.charAt(0) == ')') {
            return false;
        } else {
            stack.push(String.valueOf(s.charAt(0)));
        }

        for(int i = 1; i < s.length(); i++) {
            if(stack.isEmpty()) {
                if(s.charAt(i) == '(') {
                    stack.push(String.valueOf(s.charAt(i)));
                } else {
                    return false;
                }
            } else {
                if(String.valueOf(s.charAt(i)).equals(stack.peek())) {
                    stack.push(String.valueOf(s.charAt(i)));
                } else {
                    stack.pop();
                }
            }
        }
        
        if(stack.isEmpty()) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}