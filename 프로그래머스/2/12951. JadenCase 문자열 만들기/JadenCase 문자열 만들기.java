class Solution {
    public String solution(String s) {
        String answer = "";
        boolean prevBlank = false;
        
        answer += String.valueOf(s.charAt(0)).toUpperCase();

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer += s.charAt(i);
                prevBlank = true;
                continue;
            }
                
            if (prevBlank == true){
                answer += String.valueOf(s.charAt(i)).toUpperCase();
                prevBlank = false;
                continue;
            }
                
            answer += String.valueOf(s.charAt(i)).toLowerCase();
        }

        return answer;
    }
}