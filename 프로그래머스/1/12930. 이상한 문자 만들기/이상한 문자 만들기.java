

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        int idx = 0;
        
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals(" ")) {
                idx = 1;
            }
            
            if(idx % 2 == 0) {
                answer += strArr[i].toUpperCase();
            } else {
                answer += strArr[i].toLowerCase();
            }
            idx++;
        }
        
        return answer;
    }
}