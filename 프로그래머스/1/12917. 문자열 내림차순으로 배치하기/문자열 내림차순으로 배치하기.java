import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] str = s.toCharArray();
        Arrays.sort(str);
        
        answer = new String(str);
        answer = new StringBuilder(answer).reverse().toString();
        
        return answer;
    }
}